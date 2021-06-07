Algoritmo Ejercicio10
	sumatoria=0
	mutiplode6=0
	sumatoria1a10=0
	Mientras sumatoria<=1000 Hacer
		Escribir "Ingrese el primer numero"
		Leer num1
		Escribir "Ingrese el segundo numero"
		Leer num2
		sumatoria=sumatoria+num1+num2
		Escribir sumatoria
		si (num1%6=0) Entonces
			multiplode6=multiplode6+1
			siNo si (num2%6=0)entonces
				multiplode6=multiplode6+1	
			sino 
				Escribir "El numero no es multiplo de 6"
			FinSi
			si num1>=1 y num1<=10 Entonces
				sumatoria1a10=sumatoria1a10+num1
				sino si num2>=1 y num2<=10 Entonces
					sumatoria1a10=sumatoria1a10+num2
				SiNo
					Escribir "No hay numeros entre 1 y 10"
				FinSi
			FinSi
		FinSi
	FinMientras
	Escribir "Cantidad de numero que son multiplos de 6: " multiplode6
	Escribir "Sumatoria de numeros que van del 1 al 10: " sumatoria1a10 
	Escribir ""
	
FinAlgoritmo
