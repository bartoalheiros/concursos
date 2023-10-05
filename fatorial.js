const prompt = require('prompt-sync')({sigint: true});

// Pede ao usuário que digite algo
const number = prompt('Digite algo: ');

function fat(number) {

    if(number == 0 || number == 1)
        return 1;
    
    return number * fat(number-1);
    
}


// Mostra a entrada do usuário
console.log('O fatorial do número: ', number, 'é ', fat(number));