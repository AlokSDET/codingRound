describe("test suite name" , function() {
// function will have all tests under test suite.

});

/*
protractor setup in eclipse :

1. create javascript project 
2. create js file conf.js, spec.js
3. create a bat file (create text file , save as in .bat extension , write command protractor conf.js)
4. go to external tool configuration : new program , choose workspace and select bat file 
5/ choose workspace as project , apply , run 




*/

// spec.js
describe('Protractor Demo Practice App', function() {
    it('Form submition', function() {
      browser.get('https://qaclickacademy.github.io/protocommerce/');
  
      expect(browser.getTitle()).toEqual('ProtoCommerce');
    });


    let p = new promoise((resolve, reject) => {
        let a = 1+ 1; 

        if(a==2){
            resolve('success')
        } else {
            reject('failed');
        }
    });
// if promise is rejected then catch will be called , if promise is resolved then then will be called.
// promises replaced by callbacks.
// callback = reolve 
//errorcallback= reject


    p.then((message) => {
        console.log('This is in the then' + message)
    }).catch((message) =>{
        console.log('This is error message' + message)
    })


    const recordVideo1 = new Promise((resolve, reject) => {
        resolve("vIDEO 1 RESOLVED");
    });

    
    const recordVideo2 = new Promise((resolve, reject) => {
        resolve("vIDEO 2 RESOLVED");
    });

    
    const recordVideo3 = new Promise((resolve, reject) => {
        resolve("vIDEO 3 RESOLVED");
    });

Promise.all([recordVideo1, recordVideo2, recordVideo3]).then((messages) => {
    console.log(messages);
})


Promise.race([recordVideo1, recordVideo2, recordVideo3]).then((message) => {
    console.log(message);
})
// ES7 : async await to handle promise
// ES6 : pROMISES INTRODUCED 
// Before ES6 ,callbacks were there in java script.



const posts =  [
    {title : 'post one', body : 'this is post one'}, 
    {title : 'post two', body : 'this is post two'}, 
    {title : 'post three', body : 'this is post three'}
]

// ES6 style, remove function and use => 
function getPosts() {
setTimeout(() => {
let output ='';
posts.forEach((post, index) => {
output += '<li>${post.title}</li>';
});
document.body.innerHTML= output;
}, 1000);
}

function createPost(post) {
    setTimeout(() => {
        posts.push(post);
    }, 2000)
}

getPosts();


// fetching response from API 
const promise4 = fetch ('https://petstore.swagger.io/v2/pet/20').then(res=> res.json());

// async and await with fetch 

async function fetchUsers() {

    const res = await fetch('https://petstore.swagger.io/v2/pet/20');
    var data  = await res.json();
    console.log(data);
}

fetchUsers();
createPost({title : 'post four', body : 'this is post four'}).then(getPosts).catch(err => console.log(err)) ;

  });

  