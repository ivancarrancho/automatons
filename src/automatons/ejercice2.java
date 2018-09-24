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
public class ejercice2 {

    public static void main(String[] args) {
        int size;
        String input;
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));

        try {
            bw.write("Ingrese la cadena a validar2: \n");
            bw.flush();
            input = br.readLine();

            while(!input.equals("FIN")) {
                boolean accepted = false;
                int index = 0;
                size = input.length();

                if(index < size &&  input.charAt(index) == 'a') {
                    index ++;

                    while(index < size && input.charAt(index) == 'c') {
                        index ++;

                        if(index < size &&  input.charAt(index) == 'c') {
                            accepted = false;
                            break;
                        }
                        while(index < size && input.charAt(index) == 'a') {
                            index ++;
                            if(index < size &&  input.charAt(index) == 'b') {
                                index ++;
                                accepted = true;

                                if(index < size &&  input.charAt(index) == 'a') {
                                    index ++;

                                    while(index < size && (input.charAt(index) == 'b' || input.charAt(index) == 'c')) {
                                        index ++;
                                        accepted = true;
                                    }
                                }
                            }

                            if(index < size &&  input.charAt(index) == 'a') {
                                accepted = false;
                                break;
                            }
                        }
                    }

                    if(index < size &&  input.charAt(index) == 'b') {
                        index ++;
                        accepted = true;

                        if(index < size &&  input.charAt(index) == 'a') {
                            index ++;
                            accepted = true;
                            while(index < size && (input.charAt(index) == 'b' || input.charAt(index) == 'c')) {
                                index ++;
                            }
                        }
                    }

                }

                else if(index < size &&  input.charAt(index) == 'b' || index < size &&  input.charAt(index) == 'c') {
                    index ++;

                    while(index < size && input.charAt(index) == 'a') {
                        index ++;


                        if(index < size &&  input.charAt(index) == 'a') {
                            accepted = false;
                            break;
                        }

                        while(index < size && input.charAt(index) == 'c') {
                            index ++;
                            if(index < size &&  input.charAt(index) == 'b') {
                                index ++;
                                accepted = true;

                                if(index < size &&  input.charAt(index) == 'a') {
                                    index ++;

                                    while(index < size && (input.charAt(index) == 'b' || input.charAt(index) == 'c')) {
                                        index ++;
                                        accepted = true;
                                    }
                                }
                            }

                            if(index < size &&  input.charAt(index) == 'c') {
                                accepted = false;
                                break;
                            }
                        }
                    }

                    if(index < size &&  input.charAt(index) == 'b') {
                        index ++;
                        accepted = true;

                        if(index < size &&  input.charAt(index) == 'a') {
                            index ++;
                            accepted = true;
                            while(index < size && (input.charAt(index) == 'b' || input.charAt(index) == 'c')) {
                                index ++;
                            }
                        }
                    }
                }

                if (index != size) {
                    accepted = false;
                }

                if(accepted == true) {
                    bw.write("Cadena aceptada\n");
                    bw.flush();

                    bw.write("Ingrese la cadena a validar: \n");
                    bw.flush();
                    input = br.readLine();
                } else {
                    bw.write("Cadena rechazada\n");
                    bw.flush();

                    bw.write("Ingrese la cadena a validar: \n");
                    bw.flush();
                    input = br.readLine();
                }
            }

            if(input.equals("FIN")) {
                bw.write("Fin del autómata\n");
                bw.flush();
            }

        } catch(Exception ex){
            System.out.println("Warning: Error en los datos ingresados");
        }
    }
}