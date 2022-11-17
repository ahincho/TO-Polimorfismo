Class {
	#name : #Bus,
	#superclass : #Vehiculo,
	#instVars : [
		'pasaje'
	],
	#category : #Bus
}

{ #category : #printing }
Bus >> mostrarDatos [ 
	super mostrarDatos.
	Transcript show: pasaje; cr.
]

{ #category : #accessing }
Bus >> pasaje [
	^pasaje
]

{ #category : #accessing }
Bus >> pasaje: aDouble [
	pasaje := aDouble
]

{ #category : #printing }
Bus >> tocarClaxon [ 
	Transcript show: 'Plim! Plim! Plim! Plim!'; cr.
]
