package Practicas.Practica7.ej6;

import java.util.Map;

public interface MultiMap<K, V extends Comparable<? super V>> {
///**
//*/
//* Agrega un par key,value al multimapa si el par no existe.
void put(K key, V value);
///**
//*/
int size();
//* Cantidad de valores del multimapa.
///**
//*/
//* Cantidad de valores del multimapa para la clave key.
int size(K key);
///**
//*/
//* Elimina la clave del multimapa (con todos sus valores) si existe.
void remove(K key);
///**
//*/
//* Elimina el valor value de la clave key si existe.
void remove(K key, V value);
///**
//*/
//* Colección ordenada descendentemente de valores de clave key.
Iterable<V> get(K key);
}
