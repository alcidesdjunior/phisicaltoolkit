/*
 *  Comprimento.java v1.0
 *  Copyright (C) 2015 Alcides Duarte Jr (Cidao)
 *  Carapicuiba, SP - Brazil
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 3.0 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package org.cidao.phisical.converters.unidades;

public enum Comprimento {

	QUILOMETRO(0.001), 
	DECAMETRO(0.01), 
	METRO(1), 
	DECIMETRO(10), 
	CENTIMETRO(100),
	MILIMETRO(1000);

	private final double valor;

	Comprimento(double valor) { 
		this.valor = valor; 
	}

	public double getValor() {
		return valor;
	}

}
