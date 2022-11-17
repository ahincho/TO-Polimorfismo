Class {
	#name : #AutoTest,
	#superclass : #TestCase,
	#category : #Auto
}

{ #category : #tests }
AutoTest >> testAsientos [
	| a |
	a := Auto new.
	a asientos: 10.
	self assert: a asientos equals: 10
]

{ #category : #tests }
AutoTest >> testMostrarDatos [
	| a |
	a := Auto new.
	a matricula: '0x01'.
	a marca: 'Toyota'.
	a modelo: '8 Pro'.
	a asientos: 10.
	a mostrarDatos 
]

{ #category : #tests }
AutoTest >> testTocarClaxon [ 
	| a |
	a := Auto new.
	a tocarClaxon 
]
