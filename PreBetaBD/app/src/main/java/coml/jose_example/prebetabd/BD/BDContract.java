package coml.jose_example.prebetabd.BD;

import android.provider.BaseColumns;

/**
 * Created by jose_ on 05/04/2018.
 */

public class BDContract {

    public static abstract  class UsuarioEntry implements BaseColumns{
        public static final String TABLA_NAME = "usuarios";
        public static final String ID_USUARIO = "IDUsuario";
        public static final String NOMBRE = "Nombre";
        public static final String CORREO = "Correo";
        public static final String EDAD = "Edad";
        public static final String NACIO = "Nacionalidad";
        public static final String MODELO ="Modelo";
        public static final String PASS = "Password";
    }

    public static  abstract  class ComunidadEntry implements BaseColumns {
        public static final String TABLA_NAME = "comunidad";
        public static final String TITULO = "Titulo";
        public static final String TEXTO = "Texto";
        public static final String Ubicacion = "Ubicacion";
        public static final String FOTO = "Foto";
        public static final String IDUSUARIO = "IDUsuario";
    }

    public static abstract class RecorridoEntry implements BaseColumns{
        public static final String TABLE_NAME = "recorrido";
        public static final String ID_RECORRIDO = "IDRecorrido";
        public static final String PUNTO_INICAL = "PuntoInicial";
        public static final String PUNTO_FINAL = "PuntiFinal";
        public static final String KM = "KM";
        public static final String CALORIAS = "Calorias";
        public static final String TIEMPO = "Tiempo";
        public static final String IDUSUARIO = "IDUsuario";
    }
}
