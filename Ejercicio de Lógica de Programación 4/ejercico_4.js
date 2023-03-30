//se define la varible que contendra el numero para cantidad de digitos fibonaci
let num;

//en un ciclo dowhile se piden y seguiran pidiendo el numero hasta que el valor ingresado sea un número positivo
do {
    //se piden el valor con un prompt, se parsea a flotante el string recibido
    num = parseFloat(prompt('Ingresa un número entero'));
    // si el valor almacenado en la variable no es un número
    if(isNaN(num) || num<0){
        //se muestra en el navegador un mensaje
        alert('No ingreso un número o ingreso un valor negativo');
    }
} while (isNaN(num) || num<0);

//si el numero no es un entero
if(!(Number.isInteger(num))){
    //se muestra en el navegador un mensaje
    alert('No ingreso un número entero se eliminara el punto decimal para continuar');
    //se trunca el numero decimal para hacerlo entero
    num = Math.trunc(num);
}
//se define una funcion que recibira como parametro el numero ingresado
function fibonacci(n) {
    //se define las varibles que se usaran para crear la secuencia fibonacci
    let a = 0,b = 1,temp;
    //define un arreglo vacio que contendra los valores de la secuencia fibonacci
    let sequence = [];
    
    //si el numero ingresado es cero
    if (n === 0) {
        //se imprime por consola 0
        console.log(n);
        //se muestra en el navegador 0
        alert(`${n}`);
        
    } else if (n === 1) {// si no es 0 pero es 1
        //se imprime por consola
        console.log(0 + " " + 1);
        //se muestra en el navegador
        alert(0 + " " + 1);
    } else {// si no es 0 ni 1
        /* 
        con un cilo for utilizando nuestro numero ingresado como 
        tope se van guardando los valores fibonnaci en el arreglo
        */
        for (let i = 0; i < n; i++) {
            //se agrega el valor de a al arreglo
            sequence.push(a);
            //se le asigna a la varible temporal la suma de a+b
            temp = a + b;
            //se le asigna el valor de b a la varible a
            a = b;
            //se le asigna el valor de la varible temporal a la varible b
            b = temp;
        }
    }
    /* se meustra en el navegador el arreglo utilizando join para separarlo por espacios
    en lugar de , */
    alert(sequence.join(" "));
    /* se meustra en la consola el arreglo utilizando join para separarlo por espacios
    en lugar de , */
    console.log(sequence.join(" "));
  }
  //se manda a llamar la funcion dandole como parametro el numero ingresado
  fibonacci(num);