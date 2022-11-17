import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlanificadordeViajes {

    public static void main(String[] args) throws IOException {

        Integer numerid_reg;
        String user_reg;
        Integer idnumber_reg;
        String pass_reg;
        Integer sitios;
        Integer presupuesto;
        Integer optionSelected;
        Integer opcion;
        Integer opcionCalificacion;
        Integer opcionPlanificacion;
        Integer opcionDudas;
        Integer opcionTarea;
        Integer opcionMejoramiento;
        Integer opcionEncuesta;
        Integer lugarSoñado;
        Integer opcionVisitar;
        Integer opcionHospedamiento;
        Integer opcionViaje;
        Integer opcionParaViaje;
        Integer opcionPreguntaFrecuente;
        Integer opcionComentario;
        Integer opcionEstrategiaMejoramiento;

        final Integer MUSEO_BOTERO = 40000;
        final Integer PLAZA_DE_BOLIVAR = 35000;
        final Integer JARDIN_BOTANICO = 30000;
        final Integer ZONA_G = 25000;

        final Integer HARRY_SASSON = 50000;
        final Integer RESTAURANTE_NUEVE = 45000;
        final Integer LA_COLINA = 60000;
        final Integer LEO_N = 25000;

        final Integer FUNDACION_ZOOLOGICO_SANTACRUZ = 29000;
        final Integer CLUB_TUSHITA_ANIMAL = 35000;
        final Integer PARQUE_JAIME_DUQUE = 40000;
        final Integer EL_RUSISENOR = 41000;

        final Integer DISCOTECA_KONG = 23000;
        final Integer DISCOTECA_CORONA = 33000;
        final Integer DISCOTECA_MANJATA = 44000;
        final Integer DISCOTECA_OG = 70000;

        final Integer HOTEL_AMERICA = 230000;
        final Integer HOTEL_AG = 330000;
        final Integer HOTEL_DOMO = 440000;
        final Integer HOTEL_JAMAICA = 70000;

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el tipo de usuario\r\n °---------------------------------°");
        System.out.println("Seleccione alguna de estas opciones:");
        System.out.println("°---------------------------------°");
        System.out.println("1)Usuario registrante/Cliente.");
        System.out.println("2)Administrador.");
        System.out.println("3)Empleado.");
        System.out.println("°---------------------------------°");
        optionSelected = Integer.valueOf(scan.readLine());
        System.out.println(optionSelected);
        if (optionSelected == 1) {
            // registro de usuario
            System.out.println("Ingrese numero de identificacion:");
            numerid_reg = Integer.valueOf(scan.readLine());
            System.out.println("Ingrese su nombre del usuario");
            user_reg = String.valueOf(scan.readLine());
            System.out.println("Ingrese su numero de cedula:");
            idnumber_reg = Integer.valueOf(scan.readLine());
            System.out.println("Ingrese su contraseña:");
            pass_reg = String.valueOf(scan.readLine());

            if (numerid_reg != null && user_reg != null && idnumber_reg != null && pass_reg != null) {
                Usuario user = new Usuario(numerid_reg, user_reg, idnumber_reg, pass_reg);
                System.out.println("Su registro fue exitoso");
            } else {
                if (numerid_reg == null) {
                    System.out.println("Usuario invalido");
                } else if (user_reg == null) {
                    System.out.println("Nombre de usuario invalido");
                } else if (idnumber_reg == null || idnumber_reg.toString() == "") {
                    System.out.println("Numero de cedula invalida");
                } else if (pass_reg == null || pass_reg == "") {
                    System.out.println("Contraseña invalida");
                } else if (numerid_reg == null && user_reg == null && idnumber_reg == null && pass_reg == null) {
                    System.out.println("Todos los campos son invalidos");
                }
            }

            System.out.println("Seleccione los sitios a los cuales le gustaria ir:");
            System.out.println("°-------------------------------------------------------°");
            System.out.println("1)Me gustaria visitar los sitios de Bogota");
            System.out.println("°----------------------------------------°");
            System.out.println("2)Me gustaria ir a un restaurante con buena calidad de comida");
            System.out.println("°-----------------------------------------------------------°");
            System.out.println("3)Me gustaria ir a los mejores zoologicos de la ciudad");
            System.out.println("°----------------------------------------------------°");
            System.out.println("4)Me gustaria ir a las mejores discotecas");
            System.out.println("°---------------------------------------°");
            System.out.println("5)Me gustaria ir a un buen hotel para hospedarme");
            System.out.println("°----------------------------------------------°");
            sitios = Integer.valueOf(scan.readLine());
            if (sitios == 1) {
                System.out.println("Me gustaria visitar los sitios de Bogota");
                System.out.println("°--------------------------------------°");
                System.out.println("Museo_Botero = 40000");
                System.out.println("°------------------°");
                System.out.println("Plaza_de_Bolivar= 35000");
                System.out.println("°---------------------°");
                System.out.println("Jardin_Botanico = 30000");
                System.out.println("°---------------------°");
                System.out.println("Zona_G = 25000");
                System.out.println("°------------°");
                System.out.println("Ingrese su presupuesto: ");
                presupuesto = Integer.valueOf(scan.readLine());
                System.out.println(presupuesto);
                if (presupuesto >= MUSEO_BOTERO) {
                    System.out.println("Su presupuesto es para ir al Museo Botero");
                } else if (presupuesto >= PLAZA_DE_BOLIVAR) {
                    System.out.println("su prepuesto es para ir a la Plaza de Bolivar");
                } else if (presupuesto >= JARDIN_BOTANICO) {
                    System.out.println("Su presupuesto es para ir al Jardin Botanico");
                } else if (presupuesto >= ZONA_G) {
                    System.out.println("Su presupuesto es para ir a la Zona G");
                } else {
                    System.out.println("Su presupuesto es insuficiente");
                }

            }
            if (sitios == 2) {
                System.out.println("Me gustaria ir a un restaurante con buena calidad de comida");
                System.out.println("Harry_Sasson = 50000");
                System.out.println("°------------------°");
                System.out.println("Restaurante_Nueve = 45000");
                System.out.println("°-----------------------°");
                System.out.println("La_Colina = 60000");
                System.out.println("°---------------°");
                System.out.println("LEO_N = 25000");
                System.out.println("°-----------°");
                System.out.println("Ingrese su presupuesto: ");
                presupuesto = Integer.valueOf(scan.readLine());

                if (presupuesto >= HARRY_SASSON) {
                    System.out.println("Su presupuesto es para ir al Restaurante Harry Sasson");
                } else if (presupuesto >= RESTAURANTE_NUEVE) {
                    System.out.println("su prepuesto es para ir al Restaurante Nueve");
                } else if (presupuesto >= LA_COLINA) {
                    System.out.println("Su presupuesto es para ir al Restaurante La Colina");
                } else if (presupuesto >= LEO_N) {
                    System.out.println("Su presupuesto es para ir al Restaurante LEO N");
                } else {
                    System.out.println("Su presupuesto es insuficiente");
                }
            }
            if (sitios == 3) {
                System.out.println("Me gustaria ir a los mejores zoologicos de la ciudad");
                System.out.println("°--------------------------------------------------°");
                System.out.println("1)Fundacion_Zoologico_Santacruz = 29000");
                System.out.println("°-------------------------------------°");
                System.out.println("2)Club_Tushita_Animal = 35000");
                System.out.println("°---------------------------°");
                System.out.println("3)Parque_Jaime_Duque = 40000");
                System.out.println("°--------------------------°");
                System.out.println("4)El_Rusisenor = 41000");
                System.out.println("°--------------------°");
                System.out.println("Ingrese su presupuesto: ");
                presupuesto = Integer.valueOf(scan.readLine());

                if (presupuesto <= FUNDACION_ZOOLOGICO_SANTACRUZ) {
                    System.out.println("Su presupuesto es para ir al Zoologico Fundacion Zoologico Santacruz");
                } else if (FUNDACION_ZOOLOGICO_SANTACRUZ <= CLUB_TUSHITA_ANIMAL) {
                    System.out.println("su prepuesto es para ir al Zoologico Club Tushita Animal");
                } else if (CLUB_TUSHITA_ANIMAL <= PARQUE_JAIME_DUQUE) {
                    System.out.println("Su presupuesto es para ir al Zoologico Parque Jaime Duque");
                } else if (PARQUE_JAIME_DUQUE <= EL_RUSISENOR) {
                    System.out.println("Su presupuesto es para ir al Zoologico Rusisenor");
                } else {
                    System.out.println("Su presupuesto es insuficiente");
                }
            }
            if (sitios == 4) {
                System.out.println("Me gustaria ir a las mejores discotecas");
                System.out.println("°-------------------------------------°");
                System.out.println("DISCOTECA_KONG = 23000");
                System.out.println("°--------------------°");
                System.out.println("DISCOTECA_CORONA= 33000");
                System.out.println("°---------------------°");
                System.out.println("DISCOTECA_MANJATA= 44000");
                System.out.println("°----------------------°");
                System.out.println("DISCOTECA_OG= 70000");
                System.out.println("°-----------------°");
                System.out.println("Ingrese su presupuesto: ");
                presupuesto = Integer.valueOf(scan.readLine());
                        
                if (presupuesto <= DISCOTECA_KONG) {
                    System.out.println("Su presupuesto es para ir a la Discoteca Kong");
                }
                else if ( DISCOTECA_KONG <=DISCOTECA_CORONA) {
                    System.out.println("su prepuesto es para ir a la Discoteca Corona");
                }

                else if ( DISCOTECA_CORONA <=DISCOTECA_MANJATA) {
                    System.out.println("Su presupuesto es para ir a la Discoteca Manjata");
                }

                else if ( DISCOTECA_MANJATA <=DISCOTECA_OG) {
                    System.out.println("Su presupuesto es para ir a la Discoteca OG");
                }
             else {
                    System.out.println("Su presupuesto es insuficiente");
                }
            }
            if (sitios==5) {
                System.out.println("Me gustaria ir a un buen hotel para hospedarme");
                System.out.println("°--------------------------------------------°");
                System.out.println("HOTEL_AMERICA = 230000");
                System.out.println("°--------------------°");
                System.out.println("HOTEL_AG= 330000");
                System.out.println("°--------------°");
                System.out.println("HOTEL_DOMO= 440000");
                System.out.println("°----------------°");
                System.out.println("HOTEL_JAMAICA=70000");
                System.out.println("°-----------------°");

                System.out.println("Ingrese su presupuesto: ");
                presupuesto = Integer.valueOf(scan.readLine());
                
                if (presupuesto <= HOTEL_AMERICA) {
                    System.out.println("Su presupuesto es para hospedarse en el hotel America");
                }

                else if (HOTEL_AMERICA <=HOTEL_AG) {
                    System.out.println("su prepuesto es para hospedarse en el hotel AG");
                }

                else if (HOTEL_AG <=HOTEL_DOMO) {
                    System.out.println("Su presupuesto es para hospedarse en el hotel Domo");
                }
                else if (HOTEL_DOMO <=HOTEL_JAMAICA) {
                    System.out.println("Su presupuesto es para hospedarse en el hotel Jamaica");
                }
             else{
                    System.out.println("Su presupuesto es insuficiente");
                }
            }
        }
        if (optionSelected == 2) {
            // registro de admin
            System.out.println("Ingrese numero de identificacion:");
            numerid_reg = Integer.valueOf(scan.readLine());
            System.out.println("Ingrese su nombre del usuario");
            user_reg = String.valueOf(scan.readLine());
            System.out.println("Ingrese su numero de cedula:");
            idnumber_reg = Integer.valueOf(scan.readLine());
            System.out.println("Ingrese su contraseña:");
            pass_reg = String.valueOf(scan.readLine());
            if (numerid_reg != null && user_reg != null && idnumber_reg != null && pass_reg != null) {
                Usuario user = new Usuario(numerid_reg, user_reg, idnumber_reg, pass_reg);
                System.out.println("Su registro fue exitoso");
            } else {
                if (numerid_reg == null) {
                    System.out.println("Usuario invalido");
                } else if (user_reg == null) {
                    System.out.println("Nombre de usuario invalido");
                } else if (idnumber_reg == null || idnumber_reg.toString() == "") {
                    System.out.println("Numero de cedula invalida");
                } else if (pass_reg == null || pass_reg == "") {
                    System.out.println("Contraseña invalida");
                } else if (numerid_reg == null && user_reg == null && idnumber_reg == null && pass_reg == null) {
                    System.out.println("Todos los campos son invalidos");
                }
            }
            
            System.out.println("Seleccione alguna de estas opciones como tarea del administrador");
            System.out.println("°--------------------------------------------------------------°");
            System.out.println("1)Crear Formulario para los usuarios si tienen algun problema con el servicio\n");
            System.out.println("°-----------------------------------------------------------------------------°");
            System.out.println("2)Crear encuesta de Nivel de calificacion del servicio\n");
            System.out.println("°------------------------------------------------------°");
            System.out.println("3)Tener los nombres de cada usuario/Clientes\n");
            System.out.println("°--------------------------------------------°");
            System.out.println("4)Planificar nuevas ideas y diseños de  mejoramiento\n");
            System.out.println("°----------------------------------------------------°");
            System.out.println("5)verificar las dudas frecuentes de los usuarios\n");
            System.out.println("°------------------------------------------------°");
            System.out.println("Ingrese opcion Como nuestra tarea debemos asegurar un buen servicio la tarea de hoy es:");
            Integer adminTask =Integer.valueOf(scan.readLine());
            if (adminTask == 1){
                System.out.println("Crear Formulario para los usuarios si tienen algun problema con el servicio");
                System.out.println("Ingrese el Nombre completo:");
                String nombre = String.valueOf(scan.readLine());
                System.out.println("Ingrese su fecha de nacimiento:");
                String fechaNaci = String.valueOf(scan.readLine());
                System.out.println("Ingrese su numero de telefono:");
                String numeroTel = String.valueOf(scan.readLine());
                System.out.println("Ingrese Correo Electronico:");
                String correo = String.valueOf(scan.readLine());
                System.out.println("¿Que problema tiene acerca del servicio?");
                System.out.println("Seleccione alguna opcion del problema que tiene con el servicio");
                System.out.println("°-------------------------°");
                System.out.println("1)El servicio es algo lento");
                System.out.println("°------------------------------°");
                System.out.println("2)No encuentro buenos descuentos");
                System.out.println("°-------------------------------°");
                System.out.println("3)El catalogo es algo desordenado");
                System.out.println("°--------------------------------°");
                System.out.println("4)No veo la variedad de los sitios");
                System.out.println("°-----------------------------------°");
                System.out.println("5)No me puedo registrar correctamente");
                System.out.println("°-----------------------------------°");
                System.out.println("Ingrese opcion del problema que tiene en este formulario");
                opcion =Integer.valueOf(scan.readLine());
                if (opcion == 1) {
                    System.out.println("El servicio es algo lento");
                    for(Integer i=0; i < 1; i++) {
                        System.out.println(i + " Respuesta en Progreso...");
                        System.out.println("OK, Haremos lo posible en hacer mas eficaz el servicio");
                    }
                }
                else if (opcion == 2) {
                    System.out.println("No encuentro buenos descuentos");
                    for(Integer i=0; i <= 3; i++) {
                        System.out.println(i + " Respuesta en progreso...");
                        System.out.println("Hola queremos decir que haremos todo lo posible en encontrar mejores descuentos y buscando mejores proovedores");
                    }
                }
                else if (opcion == 3) {
                    System.out.println("El catalogo es algo desordenado");
                    for(Integer i=0; i <= 3; i++) {
                        System.out.println(i + " Respuesta en progreso...");
                        System.out.println("Hola, solucionaremos ese problema que tenemos con el catalogo muy pronto");
                    }
                }
                else if (opcion == 4) {
                    System.out.println("No veo la variedad de sitios");
                    for(Integer i=0; i <= 3; i++) {
                        System.out.println(i + " Respuesta en progreso...");
                        System.out.println("Mejoraremos la variedad del servicio");
                    }
                }
                else if (opcion == 5) {
                    System.out.println("No me puedo registar correctamente");
                    for(Integer i=0; i <= 3; i++) {
                        System.out.println(i + " Respuesta en progreso...");
                        System.out.println("Debe ser un error en el sistema ya te lo solucionaremos");
                    }
                }
                else {
                    System.out.println("Error en el formulario");
                }
            }

            if (adminTask == 2) {
                System.out.println("Crear encuesta de Nivel de calificacion del servicio");
                System.out.println("°-------------------------------------------------°");
                System.out.println("Seleccione la opcion de calificacion");
                System.out.println("°----------------°");
                System.out.println("1)Demasiado bajo\n");
                System.out.println("°------°");
                System.out.println("2)Bajo\n");
                System.out.println("°---------°");
                System.out.println("3)Regular\n");
                System.out.println("°-------°");
                System.out.println("4)Bueno\n");
                System.out.println("°-----------°");
                System.out.println("5)Excelente\n");
                System.out.println("°------------------------------------------°");
                System.out.println("ingrese alguna opcion de calificacion");
                opcionCalificacion = Integer.valueOf(scan.readLine());
                if (opcionCalificacion == 1){
                    System.out.println("Demasiado bajo");
                }
                else if(opcionCalificacion == 2){
                    System.out.println("Bajo");
                }
                else if (opcionCalificacion == 3){
                System.out.println("Regular");
                }
                else if (opcionCalificacion == 4) {
                    System.out.println("Bueno");
                }
                else if (opcionCalificacion == 5) {
                    System.out.println("Excelente");
                }
            }
            if (adminTask == 3) {
                System.out.println("Tener los nombres de cada usuario/Clientes");
                for (Integer i = 0; i <= 1; i++) {
                    System.out.println(i + "Mario," + "Carlos," + "Adriana," + "Jose," + "Karla");
                }
                System.out.println("Mandarles notificaciones para atraerlos con los mejores descuentos posibles");
                System.out.println("Hotel De Lujo 50% De descuento en hospedacion y piscina incluida");
                System.out.println("Discoteca y premier pass 60%");
                System.out.println("Zoologico OG Visita 40% De descuento+ foto con koalas");
                System.out.println("Burguer King 30% De Descuento");
                System.out.println("Guia Turistico la orientacion 40% De descuento");
                System.out.println("fin");
            }
            if (adminTask == 4) {
                System.out.println("Planificar nuevas ideas y diseños de  mejoramiento");
                System.out.println("°------------------------------------------------°");
                System.out.println("Seleccione las nuevas ideas y diseños de mejoramiento");
                System.out.println("°---------------------------------------------------°");
                System.out.println("1)Buscar las falencias del servicio y hacerlo mas rapido y eficaz\n");
                System.out.println("°-----------------------------------------------------------------°");
                System.out.println("2)Tener mas variedad en el catalogo\n");
                System.out.println("°-----------------------------------°");
                System.out.println("3)Ordenar mas el catalogo del servicio\n");
                System.out.println("°--------------------------------------°");
                System.out.println("4)Tomar encuenta los comentarios de los usuarios\n");
                System.out.println("°------------------------------------------------°");
                System.out.println("5)Interactuar mas con los usuarios y aclararle sus dudas\n ");
                System.out.println("°---------------------------------------------------------°");
                System.out.println("ingrese alguna de estas opciones para planificacion de ideas");
                opcionPlanificacion =Integer.valueOf(scan.readLine());
                if (opcionPlanificacion == 1) {
                    System.out.println("Buscar las falencias del servicio y hacerlo mas rapido y eficaz");
                }
                else if (opcionPlanificacion==2) {
                    System.out.println("Tener mas variedad en el catalogo");
                }
                else if (opcionPlanificacion==3) {
                    System.out.println("Ordenar mas el catalogo del servicio");
                }
                else if (opcionPlanificacion==4) {
                    System.out.println("Tomar encuenta los comentarios de los usuarios");
                }
                else if (opcionPlanificacion==5) {
                    System.out.println("Interactuar mas con los usuarios y aclararle sus dudas ");
                }
            }
            if (adminTask == 5) {
                System.out.println("Verificar las dudas frecuentes de los usuarios");
                System.out.println("°--------------------------------------------°");
                System.out.println("1)samuel: Hola ¿De que trata este servicio en especifico?\n");
                System.out.println("°---------------------------------------------------------°");
                System.out.println("2)Carlos: Hola disculpen ¿Como se que las referencias son confiables?\n");
                System.out.println("°---------------------------------------------------------------------°");
                System.out.println("3)Juana: Hola, No entiendo mucho el catalogo esta algo desordenado\n");
                System.out.println("°------------------------------------------------------------------°");
                System.out.println("4)Nathan: Hola Siento que no hay mucha variedad en el servicio ¿Cuando la amplian?\n");
                System.out.println("°----------------------------------------------------------------------------------°");
                System.out.println("5)Adrien: Hola No entiendo mucho las referencias y sus descuentos son algo confusos\n");
                System.out.println("°-----------------------------------------------------------------------------------°");

                System.out.println("ingrese opcion a verificar de las dudas frecuentes de los usuarios/Clientes");
                opcionDudas = Integer.valueOf(scan.readLine());
                if (opcionDudas == 1) {
                    System.out.println("Samuel: Hola ¿De que trata este servicio en especifico? ");
                    for (Integer i = 0; i <= 1; i++) {
                        System.out.println(i + "Verificada");
                        System.out.println("Hola Samuel, el servicio se trata de un planificador de viajes en el cual damos referencias de sitios de acuerdo a su presupuesto");
                    }
                }

                else if (opcionDudas ==2 ) {
                    System.out.println("Carlos: Hola disculpen ¿Como se que las referencias son confiables?");
                    for (Integer i = 0; i <= 1; i++) {
                        System.out.println(i + "Verificada");
                        System.out.println("Hola Carlos, es confibale las referencias de sitios ya que las buscamos minusiosamnete y nos ponemos en contacto con los proveedores");
                    }
                }
                else if (opcionDudas ==3) {
                    System.out.println("Juana: Hola, No entiendo mucho el catalogo esta algo desordenado");
                    for (Integer i = 0; i <= 1; i++) {
                        System.out.println(i + "Verificada");
                        System.out.println("Hola Juana, trataremos de modificar el catalogo a hacerlo mas entendible posible");
                    }
                }
                else if (opcionDudas ==4) {
                    System.out.println("Nathan: Hola Siento que no hay mucha variedad en el servicio ¿Cuando la amplian?");
                    for (Integer i = 0; i <= 1; i++) {
                        System.out.println("Verificada");
                        System.out.println("Hola Nathan, muy pronto lograremos ampliar mas el catalogo de nuestro servicio para ofrecerles mas variedades y opciones");
                    }
                }
                else if (opcionDudas ==5) {
                    System.out.println("Adrien: Hola No entiendo mucho las referencias y sus descuentos son algo confusos");
                    for (Integer i = 0; i <= 1; i++) {
                        System.out.println("Verificada");
                        System.out.println("Hola Adrien, nuestro equipo y yo trataremos de mejorar las referencias y ser mas claros con los descuentos ");
                    }
                }
               else{
                        System.out.println("Error en verificar las dudas frecuentes de los usuarios");
                    }
            }
        }
        if (optionSelected == 3) {
            // registro del empleado
            System.out.println("Ingrese numero de identificacion:");
            numerid_reg = Integer.valueOf(scan.readLine());
            System.out.println("Ingrese su nombre del usuario");
            user_reg = String.valueOf(scan.readLine());
            System.out.println("Ingrese su numero de cedula:");
            idnumber_reg = Integer.valueOf(scan.readLine());
            System.out.println("Ingrese su contraseña:");
            pass_reg = String.valueOf(scan.readLine());

            if (numerid_reg != null && user_reg != null && idnumber_reg != null && pass_reg != null) {
                Usuario user = new Usuario(numerid_reg, user_reg, idnumber_reg, pass_reg);
                System.out.println("Su registro fue exitoso");
            } else {
                if (numerid_reg == null) {
                    System.out.println("Usuario invalido");
                } else if (user_reg == null) {
                    System.out.println("Nombre de usuario invalido");
                } else if (idnumber_reg == null || idnumber_reg.toString() == "") {
                    System.out.println("Numero de cedula invalida");
                } else if (pass_reg == null || pass_reg == "") {
                    System.out.println("Contraseña invalida");
                } else if (numerid_reg == null && user_reg == null && idnumber_reg == null && pass_reg == null) {
                    System.out.println("Todos los campos son invalidos");
                }
            }
            
            System.out.println("Seleccione alguna de estas opciones para la tarea del empleado del dia de hoy");
            System.out.println("°-------------------------------------------------------------------------------------------------°");
            System.out.println("1)Mejorar las mejores referencias de los sitios ya sea museos, resturantes, discotecas, hospedaje\n");
            System.out.println("°------------------------------------------------------------------------------------------------°");
            System.out.println("2)Hacer una encuesta para conocer los gustos de nuestros clientes\n");
            System.out.println("°----------------------------------------------------------------°");
            System.out.println("3)Aclararles a los usuarios/Clientes las dudas frecuentes que tengan\n");
            System.out.println("°-------------------------------------------------------------------------------------------------°");
            System.out.println("4)Verificar los comentarios de los usuarios/Clientes y ver en que podemos mejorar nuestro servicio\n");
            System.out.println("°-------------------------------------------------------------------------------------------------°");
            System.out.println("5)Crear estrategias de mejoramiento del servicio\n");
            System.out.println("°------------------------------------------------°");

            System.out.println("Ingrese la opcion de tarea del dia del hoy del empleado para satisfacer a nuestros usuarios");
            opcionTarea =Integer.valueOf(scan.readLine());
            if (opcionTarea == 1) {
                System.out.println("Mejorar las mejores referencias de los sitios ya sea museos, resturantes, discotecas, hospedaje");
                System.out.println("°---------------------------------------------------------------------------------------------°");
                System.out.println(" Seleccione opciones del mejoramiento de referencias de los sitios ya sea museos, resturantes, discotecas, hospedaje");
                System.out.println("°------------------------------------------------------------------------------------------------------------------°");
                System.out.println("1)Investigar mas a fondo acerca de ellas y encontrar las mejores posibles\n");
                System.out.println("°-------------------------------------------------------------------------°");
                System.out.println("2)Poniendose en contacto con los proveedores\n");
                System.out.println("°--------------------------------------------°");
                System.out.println("3)Que se acomplen aun mas con el presupuesto de nuestros clientes\n");
                System.out.println("°-----------------------------------------------------------------°");
                System.out.println("4)Tener fuentes confiables\n");
                System.out.println("°--------------------------°");
                System.out.println("5)Fotos llamativas para los clientes\n");
                System.out.println("°------------------------------------°");
                System.out.println("Ingrese opcion de mejoramiento de las referencias de sitios");
                opcionMejoramiento =Integer.valueOf(scan.readLine());
                if (opcionMejoramiento == 1) {
                    System.out.println("Investigar mas a fondo acerca de ellas y encontrar las mejores posibles");
                }
                else if (opcionMejoramiento == 2) {
                    System.out.println("Poniendose en contacto con los proveedores");
                }
                else if (opcionMejoramiento == 3) {
                    System.out.println("Que se acomplen aun mas con el presupuesto de nuestros clientes");
                }
                else if(opcionMejoramiento ==4) {
                    System.out.println("Tener fuentes confiables");
                }
                else if (opcionMejoramiento == 5) {
                    System.out.println("Fotos llamativas para los clientes");
                }
             else{
                    System.out.println("Error en el mejoramiento de los sitios turisticos");
                }
            }
            if (opcionTarea == 2) {
                System.out.println("Hacer una encuesta para conocer los gustos de nuestros clientes");
                System.out.println("°-------------------------------------------------------------°");
                System.out.println("Seleccione alguna de estas opciones de la encuesta");
                System.out.println("°------------------------------------------------°");
                System.out.println("1)¿Que Lugar soñado les gustaria ir?\n");
                System.out.println("°------------------------------------°");
                System.out.println("2)¿Cual es el tipo de lugar que prefieres visitar al salir de vacaciones?\n");
                System.out.println("°-------------------------------------------------------------------------°");
                System.out.println("3)¿Cual lugar prefieres hospedarte?\n");
                System.out.println("°-----------------------------------°");
                System.out.println("4)Al realizar un viaje prefieres hacerlo con amigos, familia etc?\n");
                System.out.println("°-----------------------------------------------------------------°");
                System.out.println("5)¿Que tipo de Actividades te gusta al realizar un viaje\n");
                System.out.println("°--------------------------------------------------------°");

                System.out.println("ingrese opcion de la encuesta");
                opcionEncuesta = Integer.valueOf(scan.readLine());
                if (opcionEncuesta == 1) {
                    System.out.println("¿Que Lugar soñado les gustaria ir?");
                    System.out.println("ingrese lugar soñado");
                    lugarSoñado = Integer.valueOf(scan.readLine());
                    if (lugarSoñado == 1) {
                        System.out.println("Tailandia");
                    } else if (lugarSoñado == 2) {
                        System.out.println("New York");
                    } else if (lugarSoñado == 3) {
                        System.out.println("Paris");
                    } else if (lugarSoñado == 4) {
                        System.out.println("Japon");
                    } else if (lugarSoñado == 5) {
                        System.out.println("Estados Unidos");
                    } else {
                        System.out.println("Error al ingresar el lugar soñado");
                    }
                } else if (opcionEncuesta == 2) {
                    System.out.println("¿Cual es el tipo de lugar que prefieres visitar al salir de vacaciones?");
                    System.out.println("°---------------------------------------------------------------------°");
                    System.out.println("Seleccione ¿Cual es el tipo de lugar que prefieres visitar al salir de vacaciones?");
                    System.out.println("°--------------------------------------------------------------------------------°");
                    System.out.println("1)Barranquilla\n");
                    System.out.println("°--------------°");
                    System.out.println("2)Medellin\n");
                    System.out.println("°----------°");
                    System.out.println("3)Bogota\n");
                    System.out.println("°--------°");
                    System.out.println("4)Chile\n");
                    System.out.println("°-------°");
                    System.out.println("5)Argentina\n");
                    System.out.println("°-----------°");

                    System.out.println("ingrese alguna de las opciones del tipo de lugar que prefieres visitar al salir de vacaciones");
                    opcionVisitar = Integer.valueOf(scan.readLine());
                    if (opcionVisitar == 1) {
                        System.out.println("Barranquilla");
                    } else if (opcionVisitar == 2) {
                        System.out.println("Medellin");
                    } else if (opcionVisitar == 3) {
                        System.out.println("Bogota");
                    } else if (opcionVisitar == 4) {
                        System.out.println("Chile");
                    } else if (opcionVisitar == 5) {
                        System.out.println("Argentina");
                    } else {
                        System.out.println("error al ingresar los lugares a visitar durante las vacaciones");
                    }
                } else if (opcionEncuesta == 3) {
                    System.out.println("¿Cual lugar prefieres para hospedarte?");
                    System.out.println("°------------------------------------°");
                    System.out.println("Seleccione ¿cual lugar prefieres para hospedarte?");
                    System.out.println("°-----------------------------------------------°");
                    System.out.println("Hotel Star\n");
                    System.out.println("°----------°");
                    System.out.println("Hotel New Roman\n");
                    System.out.println("°---------------°");
                    System.out.println("Hotel 5 Estrellas\n");
                    System.out.println("°-----------------°");
                    System.out.println("Hotel Oz Resort\n");
                    System.out.println("°---------------°");
                    System.out.println("Hotel Candel Resort\n");
                    System.out.println("°-------------------°");

                    System.out.println("ingrese opcion del lugar de hospedamiento");
                    opcionHospedamiento = Integer.valueOf(scan.readLine());
                    if (opcionHospedamiento == 1) {
                        System.out.println("Hotel Star");
                    } else if (opcionHospedamiento == 2) {
                        System.out.println("Hotel New Roman");
                    } else if (opcionHospedamiento == 3) {
                        System.out.println("Hotel 5 Estrellas");
                    } else if (opcionHospedamiento == 4) {
                        System.out.println("Hotel Oz Resort");
                    } else if (opcionHospedamiento == 5) {
                        System.out.println("Hotel Candel Resort");
                    } else {
                        System.out.println("Error al ingresar lugar de hospedamiento");
                    }
                } else if (opcionEncuesta == 4) {
                    System.out.println("Al realizar un viaje prefieres hacerlo con amigos, familia etc?");
                    System.out.println("°-------------------------------------------------------------°");
                    System.out.println("Seleccione con quien realiza los viajes");
                    System.out.println("°-------------------------------------°");
                    System.out.println("1)Prefiero viajar con mis 2 hijos y mi esposo/a\n");
                    System.out.println("°-----------------------------------------------°");
                    System.out.println("2)Me gusta viajar con toda mi familia\n");
                    System.out.println("°-------------------------------------°");
                    System.out.println("3)Me gusta viajar con mis amigos\n");
                    System.out.println("°--------------------------------°");
                    System.out.println("4)Me gusta viajar con mis mascotas\n");
                    System.out.println("°----------------------------------°");
                    System.out.println("5)Prefiero viajar solo/a\n");
                    System.out.println("°------------------------°");

                    System.out.println("ingrese alguna opcion con quien realiza los viajes");
                    opcionViaje = Integer.valueOf(scan.readLine());
                    if (opcionViaje == 1) {
                        System.out.println("Prefiero viajar con mis 2 hijos y mi esposo/a");
                    } else if (opcionViaje == 2) {
                        System.out.println("Me gusta viajar con toda mi familia");
                    } else if (opcionViaje == 3) {
                        System.out.println("Me gusta viajar con mis amigos");
                    } else if (opcionViaje == 4) {
                        System.out.println("Me gusta viajar con mis mascotas");
                    } else if (opcionViaje == 5) {
                        System.out.println("Prefiero viajar solo/a");
                    } else {
                        System.out.println("Error al ingresar con quien realiza los viajes");
                    }
                } else if (opcionEncuesta == 5) {
                    System.out.println("¿Que tipo de Actividades te gusta al realizar un vijae");
                    System.out.println("°----------------------------------------------------°");
                    System.out.println(" Seleccione ¿Que tipo de Actividades te gusta al realizar un viaje");
                    System.out.println("°----------------------------------------------------------------°");
                    System.out.println("1)Asistir a una fiesta\n");
                    System.out.println("°--------------------------°");
                    System.out.println("2)Probar cada comida local\n");
                    System.out.println("°----------------------------------°");
                    System.out.println("3)Visitar el lugar mas emblematico\n");
                    System.out.println("°------------------------------°");
                    System.out.println("4)viajar en transporte publico\n");
                    System.out.println("°------------------------------°");
                    System.out.println("5)Observa por la ventana y descubre el paisaje\n");
                    System.out.println("°----------------------------------------------°");

                    System.out.println("Seleccione el tipo de actividades al realizar un viaje");
                    opcionParaViaje =Integer.valueOf(scan.readLine());
                    if (opcionParaViaje == 1) {
                        System.out.println("Asistir a una fiesta");
                    }
                    else if (opcionParaViaje==2) {
                        System.out.println("Probar cada comida local");
                    }
                    else if (opcionParaViaje==3) {
                        System.out.println("Visitar el lugar mas emblematico");
                    }
                    else if (opcionParaViaje==4) {
                        System.out.println("viajar en transporte publico");
                    }
                    else if (opcionParaViaje==5) {
                        System.out.println("Observa por la ventana y descubre el paisaje");
                    }
                    else {
                        System.out.println("Error al ingresar activiadades al realizar un vaije");
                    }
                }
            }
            if (opcionTarea == 3) {
                System.out.println("Aclararles a los usuarios/Clientes las dudas frecuentes que tengan");
                System.out.println("°---------------------------------------------------------------°");
                System.out.println("Seleccione Aclaracion de alguno de estos usuarios las dudas de nuestro servicio");
                System.out.println("°-----------------------------------------------------------------------------°");
                System.out.println("1)Juan: ¿Principalmente De que trata este servicio?\n");
                System.out.println("°---------------------------------------------------°");
                System.out.println("2)Yunan:Hola ¿Como logran obtener las  referencias son confiables?\n");
                System.out.println("°------------------------------------------------------------------°");
                System.out.println("3)Karla: Disculpen ¿Cual fue la motivacion suya de hacer este servicio?'n");
                System.out.println("°-----------------------------------------------------------------------°");
                System.out.println("4)Andres: Disculpa una duda ¿Como se que esto es algo confiable?\n");
                System.out.println("°----------------------------------------------------------------°");
                System.out.println("5)Oscar: Disculpe cual es el objetivo de este servicio\n");
                System.out.println("°------------------------------------------------------°");

                System.out.println("Ingrese alguna opcion de estas para verificar las preguntas frecuentes de los usuarios");
                opcionPreguntaFrecuente =Integer.valueOf(scan.readLine());
                if (opcionPreguntaFrecuente == 1) {
                    System.out.println("Juan: ¿Principalmente De que trata este servicio?");
                    System.out.println("respuesta del Empleado:");
                    for(Integer i=0; i<1; i++) {
                        System.out.println(i + " Verificada.");
                        System.out.println("el servicio trata de planificar viajes, de ayudarlos a que disfruten los viajes, dandoles las mejores referencias y que se acoplen a su presupuesto");
                    }
                }
                else if (opcionPreguntaFrecuente==2) {
                    System.out.println("Yunan:Hola ¿Como logran obtener las  referencias son confiables?");
                    for(Integer i=0; i<1; i++) {
                        System.out.println(i + " Verificada.");
                        System.out.println("Sip las referencias son confiables nuestro equipo siempre trata de buscar las fuentes mas confiables y contactandonos con los proveedores");
                    }
                }
                else if (opcionPreguntaFrecuente==3) {
                    System.out.println("Karla: Disculpen ¿Cual fue la motivacion suya de hacer este servicio?");
                    for(Integer i=0; i<1; i++) {
                        System.out.println(i + " Verificada.");
                        System.out.println("Nuestra motivacion carecia en resolver un problema en que las personas estaban agotadas por el arduo trabajo y no descanzaban asi que decidimos crear este servicio");
                    }
                }
                else if (opcionPreguntaFrecuente==4) {
                    System.out.println("Andres: Disculpa una duda ¿Como se que esto es algo confiable?");
                    for(Integer i=0; i<1; i++) {
                        System.out.println(i + " Verificada.");
                        System.out.println("Tranquilo, nosotros simepre contactamos con los proveedores y buscamos fuentes que sean confibles por su seguridad");
                    }
                }
                else if (opcionPreguntaFrecuente==5) {
                    System.out.println("Oscar: Disculpe cual es el objetivo de este servicio");
                    for(Integer i=0; i<1; i++) {
                        System.out.println(i + " Verificada.");
                        System.out.println("El objetivo de este proyecto no es mas que darles a todos ustedes un buen servicio de calidad, para que viajen seguros y con las mejores referencias");
                    }
                }
                else {
                        System.out.println("Error en la aclaracion");
                }
            }
            if (opcionTarea == 4) {
                System.out.println("Verificar los comentarios de los usuarios y ver en que podemos mejorar nuestro servicio");
                System.out.println("°-------------------------------------------------------------------------------------°");
                System.out.println("Seleccione la opcion para verificar");
                System.out.println("°---------------------------------°");
                System.out.println("1) Juan: Hola quisiera decir que me encanta su servicio pero el servicio es muy lento aveces y las referencias no es que me ayuden mucho, podrian mejorar eso gracias\n");
                System.out.println("°------------------------------------------------------------------------------------------------------------------------------------------------------------------°");
                System.out.println("2) Maria: Hola, lamento decir que este servicio es pesimo\n");
                System.out.println("°------------------------------------------------------°");
                System.out.println("3)Carlos: Hola buenos dias me encanta su servicio pero me gustaria ver mas oferta descuento y variedad aun mas en los sitios\n");
                System.out.println("°--------------------------------------------------------------------------------------------------------------------------°");
                System.out.println("4) Hola julian, Gracias atu comentario reorganizaremos las referencias y hacerlas lo mas claras posibles\n");
                System.out.println("°-----------------------------------------------------------------------------------------------------°");
                System.out.println("5) Jose: Hola buenas, disculpe quisiera aun mas variedad en el servicio con los sitios turisticos son excasos un poco, gracias\n");
                System.out.println("°---------------------------------------------------------------------------------------------------------------------------°");

                System.out.println("Verifique el comentario del usurio");
                opcionComentario =Integer.valueOf(scan.readLine());
                if (opcionComentario == 1) {
                    System.out.println("Juan: Hola quisiera decir que me encanta su servicio pero el servicio es muy lento aveces y las referencias no es que me ayuden mucho, podrian mejorar eso gracias");
                    for(Integer i=0; i<1; i++) {
                        System.out.println(i + " Comentario Verificado.");
                        System.out.println("Ok, Juan tendremos en cuenta tu comentario gracias a ti mejoraremos mas el servicio haciendolo mas rapido y eficaz posible");
                    }
                }
                else if (opcionComentario==2){
                    System.out.println("Maria: Hola, lamento decir que este servicio es pesimo");
                    for(Integer i=0; i<1; i++) {
                            System.out.println(i + " Comentario Verificado.");
                            System.out.println("Hola Maria, Gracias a tu comentario mejoraremos el servicio, como decimos el cliente tiene siempre la razon");
                        }
                    }
                else if (opcionComentario==3) {
                    System.out.println("Carlos: Hola buenos dias me encanta su servicio pero me gustaria ver mas oferta descuento y variedad aun mas en los sitios");
                    for (Integer i = 0; i < 1; i++) {
                        System.out.println(i + " Comentario Verificado.");
                        System.out.println("Hola Carlos, Trataremos de buscar mas ofertas y descuentos y tener mas variedada de siios al catalogo del servcio");
                    }
                }
                else if (opcionComentario==4){
                    System.out.println("Julian: Hola buenas tardes veo las referencias algo desordendas y confusas ¿Podrian mejorar eso gracias");
                        for(Integer i=0; i<1; i++) {
                            System.out.println(i + " Comentario Verificado.");
                            System.out.println("Hola julian, Gracias atu comentario reorganizaremos las referencias y hacerlas lo mas claras posibles");
                        }
                }

                else if (opcionComentario==5) {
                    System.out.println("Jose: Hola buenas, disculpe quisiera aun mas variedad en el servicio con los sitios turisticos son excasos un poco, gracias");
                    for (Integer i = 0; i < 1; i++) {
                        System.out.println(i + " Comentario Verificado.");
                        System.out.println("Hola Jose, trataremos de añadir mas variedad de sitios turisticos al catalogo del servicio");
                    }
                }
                else {
                    System.out.println("Error No verificado.");
                }
            }
            if (opcionTarea == 5) {
                System.out.println("Crear estrategias de mejoramiento del servicio");
                System.out.println("°--------------------------------------------°");
                System.out.println("Seleccione estrategias de Mejoramiento");
                System.out.println("°------------------------------------°");
                System.out.println("1)Ser mas rapidos en el servicio, mas optimo y eficaz\n");
                System.out.println("°-----------------------------------------------------°");
                System.out.println("2)Atraer a los usuarios con planes de  descuento\n");
                System.out.println("°------------------------------------------------°");
                System.out.println("3)Incrementar mas las referencias y sitios para mas actividades y diversion para nuestros usuarios\n");
                System.out.println("°--------------------------------------------------------------------------------------------------°");
                System.out.println("4)Contar con las opiniones generales de nuestros usuarios\n");
                System.out.println("°---------------------------------------------------------°");
                System.out.println("5)Poner en marcha el sistema de clasificación hotelera\n");
                System.out.println("°------------------------------------------------------°");

                System.out.println("Ingrese alguna opcion de estrategia de Mejoramiento");
                opcionEstrategiaMejoramiento =Integer.valueOf(scan.readLine());
                if (opcionEstrategiaMejoramiento == 1){
                    System.out.println("Ser mas rapidos en el servicio, mas optimo y eficaz");
                }
                else if (opcionEstrategiaMejoramiento==2) {
                    System.out.println("Atraer a los usuarios con planes de  descuento");
                }
                else if (opcionEstrategiaMejoramiento==3) {
                    System.out.println("Incrementar mas las referencias y sitios para mas actividades y diversion para nuestros usuarios");
                }
                else if (opcionEstrategiaMejoramiento==4) {
                    System.out.println("Contar con las opiniones generales de nuestros usuarios");
                }
                else if (opcionEstrategiaMejoramiento==5) {
                    System.out.println("Poner en marcha el sistema de clasificación hotelera");
                }
                else {
                    System.out.println("Error en la estrategia de mejoramiento");
                }
            }
        }
    }
}

