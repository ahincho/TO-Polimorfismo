Class {
	#name : #Vehiculo,
	#superclass : #Object,
	#instVars : [
		'matricula',
		'marca',
		'modelo'
	],
	#category : #Vehiculo
}

{ #category : #accessing }
Vehiculo >> marca [
	^marca
]

{ #category : #accessing }
Vehiculo >> marca: aString [
	marca := aString 
]

{ #category : #accessing }
Vehiculo >> matricula [
	^matricula
]

{ #category : #accessing }
Vehiculo >> matricula: aString [
	matricula := aString
]

{ #category : #accessing }
Vehiculo >> modelo [
	^modelo
]

{ #category : #accessing }
Vehiculo >> modelo: aString [
	modelo := aString 
]

{ #category : #printing }
Vehiculo >> mostrarDatos [
	Transcript show: 'Datos del Vehiculo'; cr.
	Transcript show: matricula; cr.
	Transcript show: marca; cr.
	Transcript show: modelo; cr.
]

{ #category : #printing }
Vehiculo >> tocarClaxon [
	Transcript show: 'Bonk! Bonk!'; cr.
]
