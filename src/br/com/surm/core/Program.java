/*
 * The MIT License
 *
 * Copyright (c) 2025 Valdigleis.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package br.com.surm.core;

import java.util.ArrayList;

/**
 * 
 * This class implements the notion of program to Unlimited Register Machine.
 * 
 * @author Valdigleis (valdigleis@dimap.ufrn.br)
 * @author Filipe Campos (filipe.campos.127@ufrn.edu.br)
 * @version 1.0
 */
public class Program {
  
  private ArrayList<Instruction> instructions;

  /**
   * Constructor method of the Program class, using an object ArrayList of instruction.
   * 
   * @param instructions The arraylist that contains the instructions.
   */
  public Program(ArrayList<Instruction> instructions){
    this.instructions = instructions;
  }

  /**
   * 
   * Constructor method of the Program class, using an array of instruction.
   * 
   * @param instructions The array that contains the instructions.
   */
  public Program(Instruction[] instructions){
    this.instructions = new ArrayList<>();
    for (Instruction instruction : instructions) {
      this.instructions.add(instruction);
    }
  }

  /**
   * 
   * Method that returns the instruction in a specific line of the program.
   * 
   * @param numberLine Number line in program.  
   * @return The instruction in line.
   */
  public Instruction getInstruction(int numberLine) {
    if (numberLine <= this.instructions.size()) {
        return this.instructions.get(numberLine);
    } else {
        return null;
    }
  }


  /**
   * 
   * Method that returns the program size.
   * 
   * @return
   */
  public int getSize(){
    return this.instructions.size();
  }

}
