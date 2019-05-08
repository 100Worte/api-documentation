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

## Job Profile Endpoint

The job profile endpoints are used to interact with the job profiles. Job profiles are used to compare the text input against the ideal values.

```
{
  "name": "string",
  "company-wide-visibility": true,
  "values": {
    "stds": {
      "jointPosAffil": 0,
      "jointPosAchieve": 0,
      "jointPosPower": 0,
      "relativ": 0,
      "adverb": 0,
      "we": 0
    },
    "means": {
      "jointPosAffil": 0,
      "jointPosAchieve": 0,
      "jointPosPower": 0,
      "relativ": 0,
      "adverb": 0,
      "we": 0
    }
  }
}
```

The profiles can be visible to the user only or company wide, depending on the `company-wide-visibility` flag. 

## Augmented Writing Talent Intelligence Endpoint

This endpoint is using a job profile to compare it to the input text.

```
{
  "job-profile-id": "string",
  "text": "string"
}
```

The Augmented Writing Talent Intelligence endpoint returns a list of highlights with their start- and end positions relative to the input text. Each highlight has a category attached. The overall scores are returned in the `scores` object. Words that can be replaced, are listed in `wordSuggestions`. Sentences that are to complex are returned as a tuple of start- and end position indices in `complexSentences`.

```
{
  "highlights": [
    {
      "categories": [
        "string"
      ],
      "pos": [
        0
      ]
    }
  ],
  "sidebarNotes": [
    {
      "text": "string",
      "level": 0,
      "image": "string",
      "content": "string",
      "title": "string"
    }
  ],
  "wordSuggestions": [
    {
      "text": "string",
      "pos": [
        0
      ],
      "suggestions": [
        {}
      ]
    }
  ],
  "complexSentences": [
    [
      0
    ]
  ],
  "scores": {
    "genderBalance": 0,
    "jointPosAchieve": 0,
    "jointPosAffil": 0,
    "jointPosPower": 0,
    "overall": 0
  },
  "highlightTexts": {
    "jointPosAchieve": "string",
    "jointPosAffil": "string",
    "jointPosPower": "string",
    "feminine": "string",
    "masculine": "string",
    "complexSentences": "string"
  }
}
```


