function createCounter(init){
    let current = init;
    return {
        increment:function(){
            current += 1;
            return current;
        },
         decrement:function(){
            //current -= 1;
            return --init;
         },
        reset:function(){
            //current = init;
            return ++init;
        }
       
        };

    
}
const counter = createCounter(5);
console.log(counter.increment());

console.log(counter.decrement());
console.log(counter.reset());