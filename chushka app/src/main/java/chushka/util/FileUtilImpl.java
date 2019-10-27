package chushka.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class FileUtilImpl implements FileUtil {

    public String readFile(String filePath) throws IOException {
        return Files.lines(Path.of(filePath))
                .collect(Collectors.joining());
    }
}
