package oslomet.spring3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
public class MotorvognController {
    public final List<Motorvogn> motorvognsRegister = new ArrayList<>();
    //legger ny register
    public final List<Bil> bilRegister = new ArrayList<>();

    //Initialisere bilRegister
    public MotorvognController(){
        Bil bil1 = new Bil("volvo","V30");
        bilRegister.add(bil1);

        Bil bil2 = new Bil("volvo","V70");
        bilRegister.add(bil2);

        Bil bil3 = new Bil("volvo","V91");
        bilRegister.add(bil3);

        Bil bil4 = new Bil("Audi","A8");
        bilRegister.add(bil4);

        Bil bil5 = new Bil("Audi","Q7");
        bilRegister.add(bil5);

        Bil bil6 = new Bil("Audi","Q8");
        bilRegister.add(bil6);
    }

    //ny mapping for å hente bilregister
    @GetMapping("/hentBiler")
    public List<Bil> hentBiler(){
        return bilRegister;
    }

    @PostMapping("/lagre")
    public void lagreKunde(Motorvogn bil){
        motorvognsRegister.add(bil);
    }

    @GetMapping("/hentAlle")
    public List<Motorvogn> hentAlle(){
        return motorvognsRegister;
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        motorvognsRegister.clear();
    }
}