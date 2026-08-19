import java.util.Scanner;
public class artista_musical {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombresArtisticos = new String[10];
        String[] nombresReales = new String[10];
        String[] tiposArtistas = new String[10];
        String[] generosMusicales = new String[10];
        String[] paises = new String[10];
        String[] instrumentos = new String[10];
        String[] albumesDestacados = new String[10];
        String[] cancionesDestacadas = new String[10];
        String[] anosInicio = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //---------------------------------------//
        //--|menu_principal_de_artista_musical|--//
        //---------------------------------------//
        do {
            System.out.println("menu principal de artista musical");
            System.out.println("1) Registrar artista");
            System.out.println("2) Editar artista");
            System.out.println("3) Listar artistas");
            System.out.println("4) Buscar artista");
            System.out.println("5) Eliminar artista");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-----------------------//
                //--|registrar_artista|--//
                //-----------------------//
                case 1:
                    if (total >= nombresArtisticos.length) {
                        System.out.println("No hay espacio para registrar mas artistas.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de artista musical");
                    System.out.println("id del artista a registrar: " + id);
                    System.out.print("nombre artistico: ");
                    nombresArtisticos[total] = entrada.nextLine();
                    System.out.print("nombre real: ");
                    nombresReales[total] = entrada.nextLine();
                    System.out.print("tipo de artista: ");
                    tiposArtistas[total] = entrada.nextLine();
                    System.out.print("genero musical: ");
                    generosMusicales[total] = entrada.nextLine();
                    System.out.print("pais de origen: ");
                    paises[total] = entrada.nextLine();
                    System.out.print("instrumento principal: ");
                    instrumentos[total] = entrada.nextLine();
                    System.out.print("album destacado: ");
                    albumesDestacados[total] = entrada.nextLine();
                    System.out.print("cancion destacada: ");
                    cancionesDestacadas[total] = entrada.nextLine();
                    System.out.print("año de inicio: ");
                    anosInicio[total] = entrada.nextLine();
                    System.out.print("estado del artista: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Artista registrado correctamente.");
                    total++;
                    break;
                //--------------------//
                //--|editar_artista|--//
                //--------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen artistas registrados.");
                        break;
                    }
                    System.out.println("Datos de los artistas");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Artista: " + nombresArtisticos[i] + " | Nombre real: " + nombresReales[i] + " | Tipo: " + tiposArtistas[i] + " | Genero: " + generosMusicales[i] + " | Pais: " + paises[i] + " | Instrumento: " + instrumentos[i] + " | Album: " + albumesDestacados[i] + " | Cancion: " + cancionesDestacadas[i] + " | Año inicio: " + anosInicio[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del artista: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("Editar el dato del artista");
                        System.out.print("Nuevo nombre artistico: ");
                        nombresArtisticos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo nombre real: ");
                        nombresReales[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de artista: ");
                        tiposArtistas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo genero musical: ");
                        generosMusicales[posicion] = entrada.nextLine();
                        System.out.print("Nuevo pais de origen: ");
                        paises[posicion] = entrada.nextLine();
                        System.out.print("Nuevo instrumento principal: ");
                        instrumentos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo album destacado: ");
                        albumesDestacados[posicion] = entrada.nextLine();
                        System.out.print("Nueva cancion destacada: ");
                        cancionesDestacadas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo año de inicio: ");
                        anosInicio[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado del artista: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Artista actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|listar_artistas|--//
                //---------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen artistas registrados.");
                    } else {
                        System.out.println("Lista de artistas musicales");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Artista: " + nombresArtisticos[i] + " | Nombre real: " + nombresReales[i] + " | Tipo: " + tiposArtistas[i] + " | Genero: " + generosMusicales[i] + " | Pais: " + paises[i] + " | Instrumento: " + instrumentos[i] + " | Album: " + albumesDestacados[i] + " | Cancion: " + cancionesDestacadas[i] + " | Año inicio: " + anosInicio[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //--------------------//
                //--|buscar_artista|--//
                //--------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen artistas registrados.");
                        break;
                    }
                    System.out.println("busqueda de artista");
                    System.out.print("ingresa la id para buscar artista: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del artista encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Artista: " + nombresArtisticos[posicion] + " | Nombre real: " + nombresReales[posicion] + " | Tipo: " + tiposArtistas[posicion] + " | Genero: " + generosMusicales[posicion] + " | Pais: " + paises[posicion] + " | Instrumento: " + instrumentos[posicion] + " | Album: " + albumesDestacados[posicion] + " | Cancion: " + cancionesDestacadas[posicion] + " | Año inicio: " + anosInicio[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|eliminar_artista|--//
                //----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen artistas registrados.");
                        break;
                    }
                    System.out.println("Datos de los artistas");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Artista: " + nombresArtisticos[i] + " | Nombre real: " + nombresReales[i] + " | Tipo: " + tiposArtistas[i] + " | Genero: " + generosMusicales[i] + " | Pais: " + paises[i] + " | Instrumento: " + instrumentos[i] + " | Album: " + albumesDestacados[i] + " | Cancion: " + cancionesDestacadas[i] + " | Año inicio: " + anosInicio[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del artista a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            nombresArtisticos[i] = nombresArtisticos[i + 1];
                            nombresReales[i] = nombresReales[i + 1];
                            tiposArtistas[i] = tiposArtistas[i + 1];
                            generosMusicales[i] = generosMusicales[i + 1];
                            paises[i] = paises[i + 1];
                            instrumentos[i] = instrumentos[i + 1];
                            albumesDestacados[i] = albumesDestacados[i + 1];
                            cancionesDestacadas[i] = cancionesDestacadas[i + 1];
                            anosInicio[i] = anosInicio[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Artista eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen artistas registrados.");
                        break;
                    }
                    int activos = 0;
                    int enPausa = 0;
                    int retirados = 0;
                    int disueltos = 0;
                    int otrosEstados = 0;
                    for (int i = 0; i < total; i++) {
                        if (estados[i].equalsIgnoreCase("Activo")) {
                            activos++;
                        } else if (estados[i].equalsIgnoreCase("En pausa")) {
                            enPausa++;
                        } else if (estados[i].equalsIgnoreCase("Retirado")) {
                            retirados++;
                        } else if (estados[i].equalsIgnoreCase("Disuelto")) {
                            disueltos++;
                        } else {
                            otrosEstados++;
                        }
                    }
                    String generoMayor = generosMusicales[0];
                    int cantidadGeneroMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadGenero = 0;
                        for (int j = 0; j < total; j++) {
                            if (generosMusicales[i].equalsIgnoreCase(generosMusicales[j])) {
                                cantidadGenero++;
                            }
                        }
                        if (cantidadGenero > cantidadGeneroMayor) {
                            cantidadGeneroMayor = cantidadGenero;
                            generoMayor = generosMusicales[i];
                        }
                    }
                    String tipoMayor = tiposArtistas[0];
                    int cantidadTipoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadTipo = 0;
                        for (int j = 0; j < total; j++) {
                            if (tiposArtistas[i].equalsIgnoreCase(tiposArtistas[j])) {
                                cantidadTipo++;
                            }
                        }
                        if (cantidadTipo > cantidadTipoMayor) {
                            cantidadTipoMayor = cantidadTipo;
                            tipoMayor = tiposArtistas[i];
                        }
                    }
                    String paisMayor = paises[0];
                    int cantidadPaisMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadPais = 0;
                        for (int j = 0; j < total; j++) {
                            if (paises[i].equalsIgnoreCase(paises[j])) {
                                cantidadPais++;
                            }
                        }
                        if (cantidadPais > cantidadPaisMayor) {
                            cantidadPaisMayor = cantidadPais;
                            paisMayor = paises[i];
                        }
                    }
                    String instrumentoMayor = instrumentos[0];
                    int cantidadInstrumentoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadInstrumento = 0;
                        for (int j = 0; j < total; j++) {
                            if (instrumentos[i].equalsIgnoreCase(instrumentos[j])) {
                                cantidadInstrumento++;
                            }
                        }
                        if (cantidadInstrumento > cantidadInstrumentoMayor) {
                            cantidadInstrumentoMayor = cantidadInstrumento;
                            instrumentoMayor = instrumentos[i];
                        }
                    }
                    String albumMayor = albumesDestacados[0];
                    int cantidadAlbumMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadAlbum = 0;
                        for (int j = 0; j < total; j++) {
                            if (albumesDestacados[i].equalsIgnoreCase(albumesDestacados[j])) {
                                cantidadAlbum++;
                            }
                        }
                        if (cantidadAlbum > cantidadAlbumMayor) {
                            cantidadAlbumMayor = cantidadAlbum;
                            albumMayor = albumesDestacados[i];
                        }
                    }
                    String anoMayor = anosInicio[0];
                    int cantidadAnoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadAno = 0;
                        for (int j = 0; j < total; j++) {
                            if (anosInicio[i].equalsIgnoreCase(anosInicio[j])) {
                                cantidadAno++;
                            }
                        }
                        if (cantidadAno > cantidadAnoMayor) {
                            cantidadAnoMayor = cantidadAno;
                            anoMayor = anosInicio[i];
                        }
                    }
                    String estadoMayor = estados[0];
                    int cantidadEstadoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadEstado = 0;
                        for (int j = 0; j < total; j++) {
                            if (estados[i].equalsIgnoreCase(estados[j])) {
                                cantidadEstado++;
                            }
                        }
                        if (cantidadEstado > cantidadEstadoMayor) {
                            cantidadEstadoMayor = cantidadEstado;
                            estadoMayor = estados[i];
                        }
                    }
                    System.out.println("resumen de artista musical");
                    System.out.println("Artistas registrados: " + total);
                    System.out.println("Genero mas frecuente: " + generoMayor);
                    System.out.println("Tipo de artista mas frecuente: " + tipoMayor);
                    System.out.println("Pais con mas artistas: " + paisMayor);
                    System.out.println("Instrumento mas utilizado: " + instrumentoMayor);
                    System.out.println("Album mas frecuente: " + albumMayor);
                    System.out.println("Año de inicio con mas registros: " + anoMayor);
                    System.out.println("Estado mas frecuente: " + estadoMayor);
                    System.out.println("Activos: " + activos);
                    System.out.println("En pausa: " + enPausa);
                    System.out.println("Retirados: " + retirados);
                    System.out.println("Disueltos: " + disueltos);
                    System.out.println("Otros estados: " + otrosEstados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Artista Musical.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}