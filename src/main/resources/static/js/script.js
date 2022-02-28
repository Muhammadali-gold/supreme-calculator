let query = ""
let result = "";
function test(){
    console.log('hello');
}


function btnClicked(value){
    let oldVal = $(".requestInputAndAnswerInput").val();
    // console.log(oldVal)
    $(".requestInputAndAnswerInput").val(oldVal + value)
    // console.log('write',value);
    // firstNumHas = false;
}

function operation(operator){
    if (['+','-','×','/','%'].includes(operator)){
       btnClicked(operator);
       return;
    }
    if (operator === 'C'){
        $(".requestInputAndAnswerInput").val('0');
        return;
    }
    if (operator === '±'){
        let vl = $(".requestInputAndAnswerInput").val().toString();
        if (vl.at(0) === '-'){
            $(".requestInputAndAnswerInput").val(vl.substring(1));
            return;
        }
        if (vl.at(0) === '+'){
            $(".requestInputAndAnswerInput").val('-'+vl.substring(1));
            return;
        }
        // $(".requestInputAndAnswerInput").val('+'+vl);
        return;
    }

    if (operator === '='){
        query = $(".requestInputAndAnswerInput").val();
        let query2 = query.replaceAll('×','*')
        let result = math.evaluate(query2)

        $(".requestInputAndAnswerInput").val(result);

        $(".requestHistoryLabel").text(query);
    }

    // console.log('operation',operator);
}

$(document).ready(function(){
    console.log("jquery ishladi")

    console.log('12 / (2.3 + 0.7)',math.evaluate('12 / (2.3 + 0.7)'))
});
