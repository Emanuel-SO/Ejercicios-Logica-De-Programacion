//se define la varible que contendra el numero para el factorial
let num;

//en un ciclo dowhile se piden y seguiran pidiendo el numero hasta que el valor ingresado sea un número positivo
do {
    //se piden el valor con un prompt, se parsea a flotante el string recibido
    num = parseFloat(prompt('Ingresa un número para factorial'));
    // si el valor almacenado en la variable no es un número
    if(isNaN(num) || num<0){
        //se muestra en el navegador un mensaje
        alert('No ingreso un número para el factorial o ingreso un valor negativo');
    }
} while (isNaN(num) || num<0);

//si el numero no es un entero
if(!(Number.isInteger(num))){
    //se muestra en el navegador un mensaje
    alert('No ingreso un número entero se eliminara el punto decimal para continuar');
    //se trunca el numero decimal para hacerlo entero
    num = Math.trunc(num);
}

//se define una funcion flecha que recibe el numero entero como parametro
const calcularFactorial = (num) => {
    /* se retorna el resultado de un operador ternario que en caso de ser falso se multiplica el valor inicial -1
    haceido recursividad con la funcion hasta que el valor de la variable llegue a 0 */
    return num == 0 ? 1 : num * calcularFactorial(num - 1);
  };
  //se imprime por consola el resultado de llamar a la funcion pasando como parametro el numero
  console.log(calcularFactorial(num));
  //se muestra en el navegador el resultado de llamar a la funcion pasando como parametro el numero
  alert(calcularFactorial(num));
