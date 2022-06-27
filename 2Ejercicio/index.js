/*Enunciado del ejercicio: 

Crea un nuevo archivo JS que contenga una lista con los siguientes elementos:

- Tu nombre (string)
- Tu edad (number)
- ¿Eres desarrollador? (boolean)
- Tu fecha de nacimiento (Date)
- Tu libro favorito (Objeto con propiedades: titulo, autor, fecha, url)
*/

const listDatos = {
    nombre : "Génesis",
    edad: 31,
    esDesarrollador: true,
    fechaNacimiento: new Date(1991,0,08),
    "libro-favorito": {
        titulo: "The Husky and His White Cat Shizun",
        autor: "Rou Bao Bu Chi Rou",
        fecha: new Date(2017,2,01),
        url: "https://www.amazon.com/-/es/Rou-Bao-Bu-Chi/dp/7557023609/ref=sr_1_3?qid=1656302649&refinements=p_27%3ARou+Bao+Bu+Chi+Rou&s=books&sr=1-3&text=Rou+Bao+Bu+Chi+Rou"
    }
}

console.log(listDatos.nombre);
console.log(listDatos.edad);
console.log(listDatos.esDesarrollador);
console.log(listDatos.fechaNacimiento);



