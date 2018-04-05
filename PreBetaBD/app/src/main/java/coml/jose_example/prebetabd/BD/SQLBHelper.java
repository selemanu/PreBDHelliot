package coml.jose_example.prebetabd.BD;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jose_ on 05/04/2018.
 */

public class SQLBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "HelliotApp.db";

    public SQLBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + BDContract.UsuarioEntry.TABLA_NAME + " ("
                + BDContract.UsuarioEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + BDContract.UsuarioEntry.ID_USUARIO+ " INT NOT NULL,"
                + BDContract.UsuarioEntry.NOMBRE + " TEXT NOT NULL,"
                + BDContract.UsuarioEntry.EDAD + " INT NOT NULL,"
                + BDContract.UsuarioEntry.CORREO + "TEXT NOT NULL,"
                + BDContract.UsuarioEntry.NACIO + "TEXT NOT NULL,"
                + BDContract.UsuarioEntry.MODELO + "TEXT NOT NULL,"
                + BDContract.UsuarioEntry.PASS + "TEXT NOT NULL,"
                + "UNIQUE (" + BDContract.UsuarioEntry._ID + "))");

        db.execSQL("CREATE TABLE " + BDContract.ComunidadEntry.TABLA_NAME + " ("
                + BDContract.ComunidadEntry._ID+ " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + BDContract.ComunidadEntry.TITULO + " TEXT NOT NULL,"
                + BDContract.ComunidadEntry.TEXTO + " INT NOT NULL,"
                + BDContract.ComunidadEntry.Ubicacion + "TEXT NOT NULL,"
                + BDContract.ComunidadEntry.FOTO + "TEXT NOT NULL,"
                + BDContract.ComunidadEntry.IDUSUARIO + "TEXT NOT NULL,"
                + "UNIQUE (" + BDContract.ComunidadEntry._ID + "))");

        db.execSQL("CREATE TABLE " + BDContract.RecorridoEntry.TABLE_NAME + " ("
                + BDContract.RecorridoEntry._ID+ " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + BDContract.RecorridoEntry.ID_RECORRIDO + " TEXT NOT NULL,"
                + BDContract.RecorridoEntry.PUNTO_INICAL + " INT NOT NULL,"
                + BDContract.RecorridoEntry.PUNTO_FINAL + "TEXT NOT NULL,"
                + BDContract.RecorridoEntry.KM + "TEXT NOT NULL,"
                + BDContract.RecorridoEntry.TIEMPO + "TEXT NOT NULL,"
                + BDContract.RecorridoEntry.CALORIAS + "TEXT NOT NULL,"
                + BDContract.RecorridoEntry.IDUSUARIO + "TEXT NOT NULL,"
                + "UNIQUE (" + BDContract.RecorridoEntry._ID + "))");

        mockData(db);
    }
    private void mockData(SQLiteDatabase sqLiteDatabase){
        mockUsuario(sqLiteDatabase, new Usuario("JoseManuel","jmsg228@gmail.com","20","pass","","Española"));
    }

    private long mockUsuario(SQLiteDatabase db,Usuario Usuarios){
        return db.insert(BDContract.UsuarioEntry.TABLA_NAME,
                null,
                Usuarios.toContentValues());

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public Cursor getAllProductos(){
        return getReadableDatabase().query(
                BDContract.UsuarioEntry.TABLA_NAME,
                null,
                null,
                null,
                null,
                null,
                null);
    }
}
