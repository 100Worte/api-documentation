# API Documentation
This api documentation documents how to use the current 100Worte API. 



## REST Interface	
The link that contains all possible calls (except SigniTrend, see below) is the following: https://100worte.de/rest-api . In the Rest-api all endpoints can be visible and tested on the web browser interface.

## General API Endpoint 

The general endpoint is called using a PUT request on this link https://100worte.de/v1/api/analyses 

### Node.js Tutorial
This Project contains a tutorial in Node.js that can be found in this repository that explains each call in detail in node.


### Java Tutorial
This Project contains a JAVA tutorial that can be found in this repository that explains each call in detail.

## Competence Monitor Endpoint

The competence monitor endpoint is called using a PUT request on this link https://100worte.de/v1/api/competence_monitor/analyses .
The endpoint takes as an argument a JSON as following:

```
{
  "title": "string",
  "folder": "string",
  "text": "string"
}
```

The text attribute is the only required attribute and it denotes the text that needs to be analyzed. 
The folder and the title attributes are optional and are used in the case where one wants to see the results in our [dashboard](https://www.100worte.de/dashboard) .
The endpoint returns the skill set the text describes. 
The result hence has the following format:

```
{
  "leadership": 0,
  "achievement": 0,
  "affiliation": 0,
  "contact": 0,
  "analytics": 0,
  "emotionality": 0,
  "selfConfidence": 0
}
```

## SigniTrend Endpoint

The SigniTrend Endpoint is called using a PUT request to https://dev.100worte.de/v1/api/signitrend/analyses
(the web interface here is https://dev.100worte.de/rest-api ).
The endpoint takes as an argument a JSON as following:

```
{
  "id": "myTweets",
  "docs": [
    "Die ist das erste Dokument.",
    "Und hier das zweite Dokument. Das war es!"
  ]
}
```

Both attributes are required. The `"id"` attribute is an identifier for the stream of documents. The `"docs"` attribute is a list of documents in the current *epoch* of the stream.
The response has the following format:

```
{
  "id": "myNews",
  "index": 42,
  "significant": [
    {
      "token": "Erdbeben",
      "significance": 6.296559220416156
    },
    {
      "token": "lebend\u0000gefunden",
      "significance": 2.09990692499399
    }
  ],
  "tokCount": 314,
  "docCount": 15
}
```

The `"index"` counts the number of epoch in the stream identified by `"id"`. The `"docCount"` gives the number of documents in the epoch, while `"tokCount"` gives the number of tokens extracted from these documents (with multiplicity). In the `"significant"` list you will find the tokens that appeared with a significantly higher than expected frequency, and a measure for that significance. Word pairs (in a neighbourhood window) are also accounted for, and given as a single token, joined with a Unicode `NULL` character (U+0000). This allows for an intuitive graph-based visualization, as in [Exploring Significant Interactions in Live News][2].

### Background

Our event detection is built on the following publication:

* Schubert, Erich, Michael Weiler, and Hans-Peter Kriegel. ["SigniTrend: Scalable Detection of Emerging Topics in Textual Streams by Hashed Significance Thresholds."][1] Proceedings of the 20th ACM SIGKDD International Conference on Knowledge Discovery and Data Mining. ACM, 2014, doi:10.1145/2623330.2623740

#### Cold start

The model incrementally aggregates statistics over time. In the first few epochs, these statistics may still be unreliable (cold start). Make sure to feed in several epochs, before expecting good results.

[1]: https://dx.doi.org/10.1145/2623330.2623740 "SigniTrend: Scalable Detection of Emerging Topics in Textual Streams by Hashed Significance Thresholds."
[2]: https://dbs.ifi.uni-heidelberg.de/files/Team/eschubert/publications/NewsIR2018-SignificantInteractions.pdf "Exploring Significant Interactions in Live News"
