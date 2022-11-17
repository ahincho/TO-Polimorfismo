Class {
	#name : #VehiculoTest,
	#superclass : #TestCase,
	#category : #Vehiculo
}

{ #category : #tests }
VehiculoTest >> testMarca [
	| v |
	v := Vehiculo new.
	v marca: 'Toyota'.
	self assert: v marca equals: 'Toyota'
]

{ #category : #tests }
VehiculoTest >> testMatricula [
	| v |
	v := Vehiculo new.
	v matricula: '0x01'.
	self assert: v matricula equals: '0x01'
]

{ #category : #tests }
VehiculoTest >> testModelo [
	| v |
	v := Vehiculo new.
	v modelo: '8 Pro'.
	self assert: v modelo equals: '8 Pro'
]

{ #category : #tests }
VehiculoTest >> testMostrarDatos [
	| c |
	c := Vehiculo new.
	c matricula: '0x01'.
	c marca: 'Toyota'.
	c modelo: '8 Pro'.
	c mostrarDatos 
]

{ #category : #tests }
VehiculoTest >> testTocarClaxon [
	| v |
	v := Vehiculo new.
	v tocarClaxon 
]
