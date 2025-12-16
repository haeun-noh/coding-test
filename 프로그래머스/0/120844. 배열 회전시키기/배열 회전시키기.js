function solution(numbers, direction) {
    var answer = [];
    const len = numbers.length;
    
    const first = numbers[0];
    const last = numbers[len-1];
    
    const middle = numbers.reduce((acc, num, index) => {
        if ( index == 0 || index == len-1 ) return acc;
        
        acc.push(num);
        
        return acc;
    }, []);
    
    if ( direction == "right") {
        answer = [last, first, ...middle];
    } else if ( direction == "left" ) {
        answer = [...middle, last, first];
    }
    return answer;
}