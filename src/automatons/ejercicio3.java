/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatons;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author ivan
 */
public class ejercicio3 {

    public static void main(String[] args) {
        int index, size;
        String input;        
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
        
        try {
            bw.write("3 Ingrese la cadena a validar3: \n");
            boolean accepted = false;
            index = 0;
            size = 0;
            input = br.readLine();
            
            while(!input.equals("FIN"))
            {
                size = input.length();
                accepted = false;
                
                while(index < size)
                {
                    //q0
                    if(input.charAt(index) == 'a')
                    {
                        //q1
                        index += 1;
                        
                        if(index < size && input.charAt(index) == 'c')
                        {
                            //q0
                            index += 1;
                        }
                        else
                        {
                            if(index == size - 1 && input.charAt(index) == 'b')
                            {
                                //q3
                                index += 1;
                                accepted = true;
                            }
                            
                            break;
                        }
                    }
                    else
                    {
                        if(input.charAt(index) == 'b' || input.charAt(index) == 'c')
                        {
                            //q2
                            index += 1;
                            
                            if(index < size && input.charAt(index) == 'a')
                            {
                                //q0
                                index += 1;
                            }
                            else
                            {
                                if(index == size - 1 && input.charAt(index) == 'b')
                                {
                                    //q3
                                    index += 1;
                                    accepted = true;
                                }
                                
                                break;
                            }
                        }
                    }
                }
                
                if(accepted)
                    bw.write("Cadena Aceptada " + input + "\n");
                else
                    bw.write("Cadena Rechazada " + input + "\n");
                    
                bw.flush();
                
                input = br.readLine();
                index = 0;
            }
            bw.write("Fin del autómata\n");
            bw.flush();

        } catch(Exception ex){
            System.out.println("Warning: Error en los datos ingresados");
        }
    }
}
