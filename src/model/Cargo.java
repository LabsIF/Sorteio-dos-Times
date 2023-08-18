package model;

import java.util.List;

public class Cargo {
    
    private List <String> cargo;

    public Cargo(){
        
    }

    public void beckend(){
        cargo.add("BackEnd");
    }

    public void frontend(){
        cargo.add("FrontEnd");
    }

    public void infraestrutura(){
        cargo.add("Infraestrutura");
    }

    public void designer(){
        cargo.add("Designer");
    }

    public void UiUx(){
        cargo.add("UI | UX");
    }

    public List<String> meusCargos(){
        return this.cargo;
    }

    public  String toString(){
        return this.cargo.toString();
    }
}
