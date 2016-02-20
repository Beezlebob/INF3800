// =================================================================                                                                   
// Copyright (C) 2011-2013 Pierre Lison (plison@ifi.uio.no)                                                                            
//                                                                                                                                     
// This library is free software; you can redistribute it and/or                                                                       
// modify it under the terms of the GNU Lesser General Public License                                                                  
// as published by the Free Software Foundation; either version 2.1 of                                                                 
// the License, or (at your option) any later version.                                                                                 
//                                                                                                                                     
// This library is distributed in the hope that it will be useful, but                                                                 
// WITHOUT ANY WARRANTY; without even the implied warranty of                                                                          
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU                                                                    
// Lesser General Public License for more details.                                                                                     
//                                                                                                                                     
// You should have received a copy of the GNU Lesser General Public                                                                    
// License along with this program; if not, write to the Free Software                                                                 
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA                                                                           
// 02111-1307, USA.                                                                                                                    
// =================================================================                                                                   

package no.uio.ifi.lt.preprocessing;

import java.util.logging.Level;

/**
 * Factory class to create a document reader compatible with the filename
 * extension.
 * 
 * @author  plison
 *
 */
public class DocumentReaderFactory {

	
	/**
	 * Returns a document reader which is compatible with the filename
	 * 
	 * @param filename the filename
	 * @return the corresponding document reader
	 */
	public static DocumentReader getInstance(String filename) {
		if (filename.contains(".txt")) {
			return new TextDocumentReader();
		}
		else if (filename.contains(".xml")) {
			return new XMLDocumentReader();
		}
		else {
			throw new RuntimeException("invalid file format: " + filename);
		}	
	}
}
