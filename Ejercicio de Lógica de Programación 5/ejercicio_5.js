//se define la varible que contendra el numero 
let num;
//se define un arreglo que almacenara todos los numero ingresados
let nums = [];
// se define el numero aleatorio
// let numeroAleatorio = Math.floor(Math.random() * 100) + 1;
let numeroAleatorio = 78;
 /* 
    en un ciclo dowhile se ejecura y seguira ejecutando hasta que el valor ingresado
    sea igual al  numero aleatorio
     */
do {
    /* 
    en un ciclo dowhile se piden y seguiran pidiendo el numero hasta que el valor ingresado
    sea un número positivo
     */
    do {
        //se piden el valor con un prompt, se parsea a flotante el string recibido
        num = parseFloat(prompt('Ingresa un número entero del 1 al 100'));
        // si el valor almacenado en la variable no es un número
        if(isNaN(num) || num<0){
            //se muestra en el navegador un mensaje
            alert('No ingreso un número o ingreso un valor negativo');
        }
    } while (isNaN(num) || num<0);

    //si el numero no es un entero
    if(!(Number.isInteger(num))){
        //se muestra en el navegador un mensaje
        alert('Ingreso un número con decimal se eliminara el punto decimal para continuar');
        //se trunca el numero decimal para hacerlo entero
        num = Math.trunc(num);
    }

    //si el numero no es igual al numero secreto
    if (num != numeroAleatorio) {
        //se imprime por consola un mensaje
        console.log(`Ups, el número secreto es incorrecto, vuelve a intentarlo.`);
        //se muestra en el navegador un mensaje
        alert(`Ups, el número secreto es incorrecto, vuelve a intentarlo.`);
    }
    //se agrega al arreglo de numeros el numero ingresado
    nums.push(num);

} while (num != numeroAleatorio);

console.log('Felicidades, adivinaste el número secreto.');
console.log(`Intentos: ${nums.length}`);
console.log(`Numero utilizados: ${nums.join(", ")}`);

alert('Felicidades, adivinaste el número secreto.');
alert(`Intentos: ${nums.length}`);
alert(`Numero utilizados: ${nums.join(", ")}`);
  

