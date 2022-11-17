Class {
	#name : #Moto,
	#superclass : #Vehiculo,
	#instVars : [
		'motor'
	],
	#category : #Moto
}

{ #category : #printing }
Moto >> mostrarDatos [
	super mostrarDatos.
	Transcript show: motor; cr.
]

{ #category : #accessing }
Moto >> motor [
	^motor
]

{ #category : #accessing }
Moto >> motor: aString [
	motor := aString 
]

{ #category : #printing }
Moto >> tocarClaxon [  
	Transcript show: 'Pam! Pam!'; cr.
]
