package br.com.megabrew.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum ClienteJuridico {
	@XmlEnumValue("bar")
	BAR,
	@XmlEnumValue("pub")
	PUB,
	@XmlEnumValue("restaurante")
	RESTAURANTE,
	@XmlEnumValue("lanchonete")
	LANCHONETE
}
