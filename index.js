
var request = require('request');

// Your own API Key
const apiKey = '187b38b7-94b0-429a-a4d2-7ab17d3cdba6';

// The current API Version
const wantedVersion = 'v1';

// The API URL 
const baseURL = 'https://www.100worte.de/'+wantedVersion+'/api/';


// The headers that are used in the API calls
const headers = {
    'Content-Type': 'application/json',
    'Accept': 'application/json',
    'x-api-key': apiKey,
  };

/* This function calls the analyses PUT call which takes a text as an argument and 
   returns the analysis of this text. 
*/ 
function analyze(text) {
    let options = {url: baseURL+'analyses',
                   method: 'PUT',
                   headers: headers,
                   json:true,
               	   body: {'text':text }
                 };
                   
    request(options,function(error,response,body){
        console.log('analyses')
    	if (!error && response.statusCode == 200) {
        console.log("score : ",body['score']);
        console.log("zindex : ",body['zindex']);
    	}else{
        console.log(body)
      }
    });
};

// This function prints the current status of this account. The result of the call contains an arguemnt analysesLimit, which is
// the fixed number of limits set for this package. The other argument analysisLeft contains the remaining analyses count.
function getStatus() {
    let options = {url: baseURL+'status',
                   method: 'GET',
                   json:true,
                   headers: headers };

    request(options,function(error,response,body){
        console.log('status')
    	if (!error && response.statusCode == 200) {
           console.log("requestLimit : "+body['requestLimit']);
           console.log("requestCount : "+body['requestCount']);
    	}else{
        console.log(body)
      }
    });
};

const exampleText = "Die Allnatur aber hat außerhalb ihres eigenen Kreises nichts. Das ist gerade das Bewundernswerte an ihrer Kunstfertigkeit, daß sie in ihrer Selbstbegrenzung alles, was in ihr zu verderben, zu veralten und unbrauchbar zu werden droht, in ihr eigenes Wesen umwandelt und eben daraus wieder andere neue Gegenstände bildet. Sie bedarf zu diesem Zweck ebensowenig eines außer ihr befindlichen Stoffes, als sie eine Stätte nötig hat, um das Morsche dorthin zu werfen. Sie hat vielmehr an ihrem eigenen Raum, ihrem eigenen Stoff und an ihrer eigenen Kunstfertigkeit genug.";

analyze(exampleText);
getStatus();
