/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {

        System.out.println(Convertir_km_seg(40));
        System.out.println(Convertir_cm_lt(3500));
        System.out.println(Convertir_us_cops(45623));
        System.out.println(Convertir_cent_far(0));
        System.out.println(Calcular_segs((short)1, (short)1, (short)1, (short)1));
        System.out.println(Calcular_peso_carga((float)47.5, (float)7.5));
        System.out.println(Calcular_horasxviaje("Armenia", (short)285, (short)72));
        System.out.println(Calcular_combustible(638, 312, 1243, 220));
        System.out.println(Calcular_peso_luna((byte)80));
  
  
      }
  
      /* 
       2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
       y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
       devuelva el string "Error en la conversion"
      */
      public static String Convertir_km_seg(int velocidad) {
        
        try {
          int m_seg, m_hor;
          final int conver_km_m= 1000, conver_seg_hor=3600;
          String resultado;
  
          m_seg = velocidad * conver_km_m;
          m_hor= velocidad*conver_km_m*conver_seg_hor;
  
          resultado = (double) m_seg + " m/s - " + (double) m_hor + " m/h";
          return resultado;
  
       }catch (Exception e) {
          return  "Error en la conversion"; 
       }
      }    
      
  
      /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
      cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
      */
    
      public static float Convertir_cm_lt(double cc) {
          try {
            float resultado;
            final int conver_cc_l=1000;
  
            if (cc<0)
              System.out.println("Haz ingresado valores negativos, no existen cantidades negativas");
  
            resultado = (float)cc /conver_cc_l;
            return resultado;
  
          }catch (Exception e) {
            return 0;
           
        }
  
      }
  
    
     /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
     y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
     y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
     */
     
      public static int Convertir_us_cops(int dolares) {
        try {
           int resultado=0;
           final int TRM = 4170;
  
           resultado= dolares*TRM;
           return resultado;
           
        }catch (Exception e) {
          return -1;
        }
      }  
    
     
     /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
     centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
     retorne 0.
     */
      public static float Convertir_cent_far(float temperatura_cent) {
     
        try {
          float resultado;
          final int esquival_0cent=32, esquival_100cent=9/5;
          resultado = esquival_0cent+(esquival_100cent*temperatura_cent);
         return resultado;
  
       }catch (Exception e) {
         return 0;
      }
    }
            
  
     
     /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
     el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
     Si hay algún error, devuelva -1.
     */
  
      public static int Calcular_segs(short dias,short horas,short minutos,short segundos) {
         try {
             int convert_seg=0;
             final int equiv_min_seg = 60,  equiv_hor_seg = 3600, equiv_dia_seg = 86400;
   
           if (dias<0 && horas<0 && minutos<0 && segundos<0){
            System.out.println("No ingreses valores negativos");
           }
            convert_seg = (dias*equiv_dia_seg) + (horas * equiv_hor_seg)+ (minutos*equiv_min_seg) +(segundos);
            return convert_seg;

           }catch (Exception e) {
            return -1;
        }
      }
      
  
     /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
     Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
     lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
     en un string del tipo: "### kilos - ### toneladas". 
     Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/
  
      public static String Calcular_peso_carga(float peso_cargado, float peso_vacio) {
         try {
           int peso_neto =0;
           final int conver_ton_kg= 1000;
           String resultado;  
  
           peso_neto = (int) (peso_cargado - peso_vacio);

           if (peso_cargado< 0 && peso_neto<0) 
             return "no ingrese valores negativos o nulos";
     
            resultado = (double)(peso_neto*conver_ton_kg)+ " kilos - " + (double)peso_neto + " toneladas"; 
            return resultado;
  
         }catch (Exception e) {
           return "Error en la función Calcular_peso_carga";
         }
     }
   
  
     /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
     necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
     otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
     Si hay algún error, devuelva -1.
     */
      public static float Calcular_horasxviaje(String destino, short distancia, short velocidad_prom) {
         try {
           float horas = 0;
  
           if (distancia <0 && velocidad_prom < 0)
            return -1;
            
           horas = (float)(distancia/velocidad_prom);
            System.out.println("Tu viaje a "+destino+ " demora "+ horas +" horas");
    
            return horas;

         } catch (Exception e) {
           return  -1;
         }
     }
  
  
     
     /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
     Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
     En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
     
     El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
     el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
     de combustible que debe ser cargado en el avión.
     
     Si hay algún error, devuelva -1.*/
  
      public static float Calcular_combustible(int ruta1, int ruta2,int ruta3, int ruta4) {
        try {
           float combustible_necesario=0, totalrutas=0;
           final float ton_iniciales=0.2f, dist_max=60.8f, ton_aterrizaje=0.4f, ton_despegue=1.2f;
  
           totalrutas = (float) (ruta1 + ruta2 + ruta3 + ruta4);
        
           combustible_necesario=(totalrutas/dist_max)*ton_iniciales+ton_aterrizaje+ton_despegue;
           
           return combustible_necesario ;
           
        }catch (Exception e) {
           return -1; 
         }
     }
     
     
     /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
     y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
     peso_tierra_new = peso_kilos * 9.81m/s2
     peso_luna_new = peso_tierra_new * 0.165
     
     Si hay algún error, devuelva 0.
     */
     
     public static double Calcular_peso_luna(byte masa_kilos) {
      try {
         double peso_tierra_new =0, peso_luna_new;
         final double gravedad_tierra = 9.81,gravedad_luna=0.165; 

          if (masa_kilos < 0) {
              return 0; 
          }
  
           peso_tierra_new = (double)(masa_kilos * gravedad_tierra);
           peso_luna_new = (double)(peso_tierra_new * gravedad_luna);
          return peso_luna_new;

      } catch (Exception e) {
          return 0;
      }
  
     
  }
}
