/*
 * 2007-2016 [PagSeguro Internet Ltda.]
 * 
 * NOTICE OF LICENSE
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Copyright: 2007-2016 PagSeguro Internet Ltda.
 * Licence: http://www.apache.org/licenses/LICENSE-2.0
 */

package br.com.uol.pagseguro.api.transaction;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 * Implementation of {@code RefundedTransaction}
 *
 * @author PagSeguro Internet Ltda.
 */
@XmlRootElement(name = "result")
public class RefundResponseXMLTransaction {

	private String result;

	RefundResponseXMLTransaction() {
	}

	public String getResult() {
		return result;
	}

	@XmlValue
	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "RefundResponseXMLTransaction{" + "result='" + result + '\'' + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof RefundResponseXMLTransaction))
			return false;

		RefundResponseXMLTransaction that = (RefundResponseXMLTransaction) o;

		return result != null ? result.equals(that.result) : that.result == null;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.result == null) ? 0 : this.result.hashCode());
		return result;
	}

}
