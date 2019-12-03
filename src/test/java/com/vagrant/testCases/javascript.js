// Closure

var manual = function(age){
    var testerAge = function(age2){
      return age2+age;
      };
      return testerAge;
    };
    
    
    var p = new manual(1);
    console.log(p(2));