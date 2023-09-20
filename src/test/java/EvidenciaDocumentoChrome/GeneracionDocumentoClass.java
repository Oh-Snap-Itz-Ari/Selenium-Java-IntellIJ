package EvidenciaDocumentoChrome;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.awt.*;
import java.io.IOException;

public class GeneracionDocumentoClass {

    public void DescripcionPasoScript(String descripcionPaso) throws IOException, InvalidFormatException, AWTException {
        GeneracionDocumentoBase.OpenFile(1, descripcionPaso);
        GeneracionDocumentoBase.Screenshoot();
    }

    public void InicializaArchivo() throws IOException, InvalidFormatException, AWTException {
        GeneracionDocumentoBase.defineVariables();
    }

    public void GeneraEvidencia(String NombreArchivo) throws IOException {
        GeneracionDocumentoBase.CloseFile(NombreArchivo);
    }
}
