# CalculadorApi - AES
Ejercicio de calculadora AES para la materia ModVad 2019

----
  _Servicio para la suma, resta, multiplicación y división de números enteros._

## DockerHub
### Pull:
`docker pull  wilsonforerojav/calculadoramsb:v2`   
### Run:
`docker container run -p 8080:8080 -it wilsonforerojav/calculadoramsb:v2`      

## Código Fuente
### En el root del folder calculadora
#### Build:
`docker build --tag=calculadora . `     
#### Run:
`docker container run -p 8080:8080 -it calculadora`   

## Uso del servicio

### URL
_http://localhost:8080/calculadora/calc/_

#### Sumar:
`GET`  

[ /add?num1=34&num2=45 ](http://localhost:8080/calculadora/calc/add?num1=34&num2=45)

##### Required:
 
   `num1=[integer]`
   `num2=[integer]`

#### Restar:
`DELETE`

[ /sub  ](http://localhost:8080/calculadora/calc/sub)

```
{
	"num1":48,
	"num2":43
}
```

#### Multiplicar:
`POST`

[ /mul  ](http://localhost:8080/calculadora/calc/mul)
```
{
	"num1":48,
	"num2":43
}
```
#### Dividir:
`PUT`

[ /div?num1=432&num2=45 ](http://localhost:8080/calculadora/calc/div?num1=432&num2=45)

##### Required:
 
   `num1=[integer]`
   `num2=[integer]`

