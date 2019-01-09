# API Documentation
This api documentation documents how to use the current 100Worte API. 



## REST Interface	
The link that contains all possible calls is the following: https://100worte.de/rest-api . In the Rest-api all endpoints can be visible and tested on the web browser interface.

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


