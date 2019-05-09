# calculadoraaes
Ejercicio de calculadora AES

# Para descargar la imagen desde dockerhub
Pull:\
docker pull  wilsonforerojav/calculadoramsb:v1\
Run:\
docker container run -p 8080:8080 -it wilsonforerojav/calculadoramsb:v1      \

# Para hacer build desde los fuentes
Ubicarse en la carpeta calculadora\
Build:\
docker build --tag=calculadora .      \
Run:\
docker container run -p 8080:8080 -it calculadora\

# Uso del servicio
Sumar:\
GET\
http://localhost:8080/calculadora/calc/add?num1=34&num2=45 \
Restar:\
DELETE\
http://localhost:8080/calculadora/calc/sub \
{
	"num1":48,
	"num2":43
}\
Multiplicar:\
POST\
http://localhost:8080/calculadora/calc/mul \
{
	"num1":48,
	"num2":43
}\
Dividir:\
PUT\
http://localhost:8080/calculadora/calc/div?num1=432&num2=45

