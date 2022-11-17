Class {
	#name : #MotoTest,
	#superclass : #TestCase,
	#category : #Moto
}

{ #category : #tests }
MotoTest >> testMostrarDatos [
	| m |
	m := Moto new.
	m matricula: '0x01'.
	m marca: 'Toyota'.
	m modelo: '8 Pro'.
	m motor: '4 Tiempos'.
	m mostrarDatos 
]

{ #category : #tests }
MotoTest >> testMotor [
	| m |
	m := Moto new.
	m motor: '4 Tiempos'.
	self assert: m motor equals: '4 Tiempos'
]

{ #category : #tests }
MotoTest >> testTocarClaxon [ 
	| m |
	m := Moto new.
	m tocarClaxon 
]
