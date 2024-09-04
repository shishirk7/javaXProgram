function expect(val){
    return {
        toBe:function(expected){
            if(val === expected){
                return true;
            }else{
                throw new Error("not equal");
            }
        },
        notToBe:function(expected){
            if(val!== expected){
                return true;
            }else{
                throw new Error("equal");
            }
            
        }
    };
}

try{
    console.log(expect(5).toBe(5));
    console.log(expect(5).notToBe(10));
}catch(error){
    console.error(error.message);
}