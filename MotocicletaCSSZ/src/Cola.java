import java.util.LinkedList;
import java.util.Queue;

public class Cola {

    private Queue<MotocicletaaCSSZ> cola;

    public Cola() {
      cola = new LinkedList<MotocicletaaCSSZ>();
      quemar();
    }

    public void quemar(){
    cola.add(new MotocicletaaCSSZ("kia","POB122","2",2021));
    cola.add(new MotocicletaaCSSZ("hyundai","POB-125","3",2019));
    cola.add(new MotocicletaaCSSZ("honda","POB-182","4",2022));
    cola.add(new MotocicletaaCSSZ("suzuki","PPB-122","5",2022));
    cola.add(new MotocicletaaCSSZ("tucson","PNB-120","9",2024));
    }

    public MotocicletaaCSSZ regresoplaca(String p){
        for (MotocicletaaCSSZ u: cola){
            if (u.getPlaca().equalsIgnoreCase(p)){
                return u;
            }
        }
        return null;
    }
}
