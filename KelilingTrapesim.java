
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class KelilingTrapesim {
    public static void main(String[] args) {

        String namaFile = "./src/kelilingTrapesim";

        List<KelilingTrapesim> luasTrapesim = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                double alas = Double.parseDouble(data[0]);
                double tinggi = Double.parseDouble(data[1]);
                double atas = Double.parseDouble(data[2]);

                LuasTrapesim trapesim = new LuasTrapesim(alas,tinggi,atas);
                luasaTrapesim.list.add(trapesim);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        for (int i = 0; i < luasTrapesium.size(); i++) {


            if (luastrapesim.get(i).paslon01 > luasTrapesim.get(i).trapesium.txt
                    && luasTrapesim.get(i).trapesium.txt > .get(i).trapesium.txt) {
                System.out.println(luasTrapesim.get(i).label + " " + luasTrapesim.get(i).paslon01);
            }
        }

    }
}