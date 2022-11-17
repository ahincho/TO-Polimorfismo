Class {
	#name : #BusTest,
	#superclass : #TestCase,
	#category : #Bus
}

{ #category : #tests }
BusTest >> testMostrarDatos [
	| b |
	b := Bus new.
	b matricula: '0x01'.
	b marca: 'Toyota'.
	b modelo: '8 Pro'.
	b pasaje: 3.50.
	b mostrarDatos 
]

{ #category : #tests }
BusTest >> testPasaje [
	| b |
	b := Bus new.
	b pasaje: 3.50.
	self assert: b pasaje equals: 3.50
]

{ #category : #tests }
BusTest >> testTocarClaxon [ 
	| b |
	b := Bus new.
	b tocarClaxon 
]
