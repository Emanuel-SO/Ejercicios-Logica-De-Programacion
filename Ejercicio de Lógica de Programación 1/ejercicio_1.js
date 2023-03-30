function ordenarNumero(){
    //muestra un mensaje por el navegador
    alert('Ingresa 3 números');
    //se le recuperan valores por medio de prompt, se transforman en enteros y se asignan a las variables
    let num1 =  parseInt(prompt("Ingresa el primer numero"));
    let num2 =  parseInt(prompt("Ingresa el primer numero"));
    let num3 =  parseInt(prompt("Ingresa el primer numero"));
    //Se compruba que las variables no contengan numeros
    if (isNaN(num1) || isNaN(num2) || isNaN(num3)) {
       //si no contienen numeros se muestra un mensaje en el navegador
        alert(`Algun valor no es numéro`);
    } else if (num1 == num2 && num2 == num3) {
    //si contienen numeros pero son iguales se muestra mensaje en el navegador
    alert('Los numeros son iguales');
    }else{
        //si contienen numeros y por lo menos 2 son diferentes
        //agrega los valores a un arreglo 
        const order = [num1, num2, num3];
        //se imprime por consola los valores de de menos a mayor y mayor a menor utilizando un sort en el arreglo
        console.log(`Numeros de menor a mayor: ${order.sort((a, b) => a - b)}`);
        console.log(`Numeros de mayor a menor: ${order.sort((a, b) => b - a)}`);
        //se muestra en el navegador los valores de de menos a mayor y mayor a menor utilizando un sort en el arreglo
        alert(`Numeros de menor a mayor: ${order.sort((a, b) => a - b)}`);
        alert(`Numeros de mayor a menor: ${order.sort((a, b) => b - a)}`);
    }
}
//se ejecuta la funcion que pide los valores y los ordena
ordenarNumero();