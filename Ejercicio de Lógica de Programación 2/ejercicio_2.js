//se define la varible que contendra los grados celcius a recibir
let celcius;
//en un ciclo dowhile se piden y seguiran pidiendo los grados celcius hasta que el valor ingresado sea un número
do {
    //se piden el valor con un prompt, se parsea a float el string recibido
    celcius = parseFloat(prompt('Ingresa los celcius a combertir'));
    // si el valor almacenado en la variable no es un número
    if(isNaN(celcius)){
        //se muestra en el navegador un mensaje
        alert('No ingreso un número para grados celcius');
    }
} while (isNaN(celcius));

//se define un funcion flecha que recibe los grados celcius
const convertirTemperatura = (celcius) => {
    //define una varible que almacena la conversiona grados farenheit
    let farenheit = celcius * 1.8 + 32;
    //define una varible que almacena la conversiona grados kelvin
    let kelvin = celcius + 273.15;
    
    //se muestran por consola las varibles que tienen las conversiones
    console.log("Fahrenheit: " + farenheit);
    console.log("Kelvin: " + kelvin);
    //se muestran en el navegador las varibles que tienen las conversiones
    alert("Fahrenheit: " + farenheit);
    alert("Kelvin: " + kelvin);
  };
//se manda a llamar la funcion que convertira los grados celcius en farenheit y kelvin
convertirTemperatura(celcius);

