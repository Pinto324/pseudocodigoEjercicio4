Algoritmo Ejercicio4
	CalcMenor = 0
	CalcMayor = 0
	Para i<-0 Hasta 20 Con Paso 1 Hacer
		Escribir "Ingrese la edad"
		Leer Edad
		Si Edad > CalcMayor  Entonces
			CalcMayor = Edad
		FinSi
		Si CalcMenor >  Edad Entonces
			CalcMenor = Edad	
		FinSi
	Fin Para
	Escribir "La mayor edad es de: ",CalcMayor
	Escribir "La Menor edad es de: ",CalcMenor
FinAlgoritmo
