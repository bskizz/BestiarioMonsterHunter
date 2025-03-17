package bestiariomonsterhunter.Monstruos;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Víctor Arroyo
 */
public class ListaMonstruos {

    private List<Monstruo> listaMonstruos;

    public ListaMonstruos() {
        this.listaMonstruos = new ArrayList<>();
        agregarMonstruos();
    }

    public void agregarMonstruo(Monstruo monstruo) {
        listaMonstruos.add(monstruo);
    }

    public List<Monstruo> getListaMonstruos() {
        return listaMonstruos;
    }

    private void agregarMonstruos() {
        //Terrestre
        Monstruo barroth = new Terrestre(4, "Barroth", "Barroth es un monstruo robusto y temible, caracterizado por su caparazón de barro endurecido y sus embestidas poderosas. Habitante de zonas fangosas y arenosas, utiliza su imponente masa para desequilibrar a sus oponentes, convirtiendo cada encuentro en una prueba estratégica para los cazadores.", Monstruo.Elemento.AGUA, Monstruo.Elemento.HIELO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/barroth.png")));
        Monstruo anjanath = new Terrestre(2, "Anjanath", "Anjanath es un wyvern corpulento y feroz, reconocido por su devastador aliento ígneo y su inquebrantable instinto para defender su territorio. Sus ataques explosivos y su presencia intimidante han forjado una leyenda entre los cazadores que se atreven a enfrentarlo.", Monstruo.Elemento.FUEGO, Monstruo.Elemento.AGUA, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/anjanath.png")));
        Monstruo diablos = new Terrestre(4, "Diablos", "Diablos es un wyvern brutal originario de los desiertos. Con sus cuernos retorcidos y su piel endurecida, ataca a sus presas con fuerza devastadora. Su agilidad en el árido entorno y su comportamiento salvaje le han ganado un lugar destacado en las leyendas de Monster Hunter.", Monstruo.Elemento.NINGUNO, Monstruo.Elemento.HIELO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/diablos.png")));
        Monstruo uragaan = new Terrestre(4, "Uragaan", "Uragaan es un colosal monstruo con un cuerpo cubierto de minerales explosivos. Habitante de terrenos montañosos, utiliza su fuerza bruta y ataques explosivos para alterar el entorno, siendo uno de los oponentes más formidables para los cazadores.", Monstruo.Elemento.FUEGO, Monstruo.Elemento.AGUA, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/uragaan.png")));
        Monstruo tigrex = new Terrestre(4, "Tigrex", "Tigrex es un wyvern feroz, célebre por su fuerza descomunal y su rugido ensordecedor. Sus ataques rápidos y devastadores convierten cada enfrentamiento en una batalla intensa, haciendo de él uno de los monstruos más temidos del bestiario.", Monstruo.Elemento.NINGUNO, Monstruo.Elemento.RAYO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/tigrex.png")));
        Monstruo brachydios = new Terrestre(4, "Brachydios", "Brachydios es un monstruo singular, cuyos puños explosivos y la producción de un limo inflamable generan ataques caóticos. Su presencia en el campo de batalla es impredecible, obligando a los cazadores a enfrentarse a explosiones que pueden cambiar el curso de la lucha en un instante.", Monstruo.Elemento.NINGUNO, Monstruo.Elemento.AGUA, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/brachydios.png")));
        Monstruo radobaan = new Terrestre(4, "Radobaan", "Radobaan es un wyvern peculiar que se desplaza rodando por el campo de batalla. Su cuerpo óseo y su armadura natural le permiten embestir con gran potencia, convirtiéndolo en un adversario astuto que requiere de estrategias precisas para ser vencido.", Monstruo.Elemento.NINGUNO, Monstruo.Elemento.DRACO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/radobaan.png")));
        Monstruo lagombi = new Terrestre(2, "Lagombi", "Lagombi es un depredador ágil que se desplaza sobre el hielo con la velocidad y precisión de una liebre ártica. Su habilidad para maniobrar en terrenos congelados lo convierte en un cazador excepcional en entornos extremos.", Monstruo.Elemento.HIELO, Monstruo.Elemento.FUEGO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/brachydios.png")));

//        // Voladores
        Monstruo rathian = new Volador(2, "Rathian", "Rathian es la emblemática reina de la selva volcánica. Con escamas rojas vibrantes y un aliento ígneo capaz de arrasar con todo a su paso, esta bestia feroz domina los territorios boscosos y montañosos. Su agresividad y destreza en combate la han convertido en uno de los mayores desafíos para los cazadores, y su leyenda perdura en cada enfrentamiento.", Monstruo.Elemento.FUEGO, Monstruo.Elemento.DRACO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/rathian.png")));
        Monstruo khezu = new Volador(2, "Khezu", "Khezu es un monstruo enigmático, conocido por su falta de visión y por emitir sonidos estridentes que confunden a sus presas. Su piel pálida y su comportamiento errático le permiten emboscar con sigilo, haciendo de él un cazador letal en condiciones adversas.", Monstruo.Elemento.RAYO, Monstruo.Elemento.FUEGO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/khezu.png")));
        Monstruo rathalos = new Volador(2, "Rathalos", "En su forma voladora, Rathalos es el rey indiscutible de los cielos. Con un vuelo acrobático y un aliento de fuego devastador, este wyvern ataca con precisión y destreza, imponiendo respeto y temor en aquellos que se atreven a desafiarlo.", Monstruo.Elemento.FUEGO, Monstruo.Elemento.DRACO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/rathalos.png")));
        Monstruo legiana = new Volador(2, "Legiana", "Legiana es un wyvern elegante y letal, que habita las alturas heladas. Su agilidad y capacidad para lanzar ráfagas gélidas la convierten en un adversario formidable, siendo recordada en leyendas por su belleza helada y su peligrosidad en el combate aéreo.", Monstruo.Elemento.HIELO, Monstruo.Elemento.FUEGO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/legiana.png")));
        Monstruo bazelgeuse = new Volador(2, "Bazelgeuse", "Bazelgeuse es un wyvern explosivo, capaz de soltar escamas que generan explosiones al impactar. Su naturaleza caótica y su impredecible estilo de combate hacen de cada vuelo una experiencia de destrucción total en el cielo.", Monstruo.Elemento.FUEGO, Monstruo.Elemento.RAYO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/bazelgeuse.png")));
        Monstruo nargacuga = new Volador(2, "Nargacuga", "Nargacuga es un wyvern ágil y sigiloso, cuyos movimientos furtivos y su cola afilada le permiten emboscar a sus presas con gran eficacia. Su reputación se basa en su habilidad para atacar sin ser detectado, convirtiéndolo en un enemigo casi invisible.", Monstruo.Elemento.NINGUNO, Monstruo.Elemento.RAYO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/nargacuga.png")));
        Monstruo seregios = new Volador(2, "Seregios", "Seregios es un wyvern imponente, con escamas afiladas que actúan como una armadura natural. Durante el combate, despliega ataques coordinados y letales, demostrando una estrategia de embestidas que lo hace uno de los monstruos más estudiados y temidos en el aire.", Monstruo.Elemento.NINGUNO, Monstruo.Elemento.RAYO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/seregios.png")));
        Monstruo astalos = new Volador(2, "Astalos", "Astalos es un wyvern eléctrico que canaliza la energía de los rayos en cada uno de sus ataques. Con destellos brillantes y una velocidad asombrosa, desata tormentas eléctricas que confunden y desmoralizan a sus enemigos.", Monstruo.Elemento.RAYO, Monstruo.Elemento.HIELO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/astalos.png")));
        Monstruo valstrax = new Volador(2, "Valstrax", "Valstrax es un dragón de alta velocidad, con un diseño aerodinámico que le permite alcanzar impresionantes velocidades en pleno vuelo. Sus ataques fulminantes y su precisión letal lo han convertido en una leyenda del combate aéreo.", Monstruo.Elemento.DRACO, Monstruo.Elemento.FUEGO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/valstrax.png")));
        Monstruo basarios = new Volador(2, "Basarios", "Basarios es un wyvern volador especializado en la dispersión de gases venenosos. Durante el combate, libera una nube tóxica que debilita a sus enemigos, convirtiéndolo en un oponente extremadamente peligroso y estratégico.", Monstruo.Elemento.FUEGO, Monstruo.Elemento.DRACO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/basarios.png")));

        // Acuáticos
        Monstruo mizutsune = new Acuatico(true, "Mizutsune", "Mizutsune es un elegante leviatán acuático, célebre por deslizarse con gracia bajo el agua y lanzar burbujas explosivas que confunden a sus oponentes. Su comportamiento casi etéreo y su habilidad para manipular el agua lo hacen único en el bestiario.", Monstruo.Elemento.AGUA, Monstruo.Elemento.RAYO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/mizutsune.png")));
        Monstruo lagiacrus = new Acuatico(false, "Lagiacrus", "Lagiacrus, el señor de los mares, es un leviatán imponente capaz de generar poderosas descargas eléctricas. Su tamaño colosal y su estrategia arrolladora lo convierten en un verdadero titán del océano, infundiendo temor en todo aquel que se atreva a desafiarlo.", Monstruo.Elemento.RAYO, Monstruo.Elemento.FUEGO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/lagiacrus.png")));
        Monstruo jyuratodus = new Acuatico(true, "Jyuratodus", "Jyuratodus es un pez dragón que se camufla en zonas fangosas y lodazales. Con movimientos bruscos y embistes poderosos, este monstruo encarna la ferocidad y adaptabilidad del entorno acuático, representando un desafío constante para los cazadores.", Monstruo.Elemento.AGUA, Monstruo.Elemento.RAYO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/jyuratodus.png")));
        Monstruo zamtrios = new Acuatico(true, "Zamtrios", "Zamtrios es un tiburón anfibio conocido por su extraña capacidad para inflarse y confundir a sus enemigos. Su comportamiento impredecible y tácticas poco convencionales lo convierten en un enigma dentro del reino acuático.", Monstruo.Elemento.HIELO, Monstruo.Elemento.RAYO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/zamtrios.png")));
        Monstruo gobul = new Acuatico(false, "Gobul", "Gobul es un astuto depredador marino que se entierra en el fondo del océano para acechar a sus presas. Utilizando una gran antena para atraer y emboscar, combina ingenio y letalidad en cada ataque.", Monstruo.Elemento.AGUA, Monstruo.Elemento.RAYO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/gobul.png")));
        Monstruo plesioth = new Acuatico(true, "Plesioth", "Plesioth es un wyvern acuático de velocidad asombrosa, capaz de ejecutar maniobras evasivas con precisión milimétrica. Su habilidad para emboscar a sus presas en un instante lo posiciona como uno de los depredadores más eficientes del mar.", Monstruo.Elemento.AGUA, Monstruo.Elemento.RAYO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/plesioth.png")));

        // Dragones Ancianos
        Monstruo kushalaDaora = new DragonAnciano("Kushala Daora", "Kushala Daora es un venerable dragón anciano que domina los elementos del viento y las tormentas. Su piel metálica y figura imponente reflejan años de sabiduría y poder, haciendo de cada embestida un espectáculo de fuerza y precisión.", Monstruo.Elemento.HIELO, Monstruo.Elemento.FUEGO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/kushalaDaora.png")));
        Monstruo teostra = new DragonAnciano("Teostra", "Teostra es un dragón anciano envuelto en llamas, cuya furia incendiaria ha quedado grabada en la memoria de generaciones de cazadores. Sus explosiones de fuego arrasan con todo a su paso, dejando un rastro de destrucción y renacimiento en cada combate.", Monstruo.Elemento.FUEGO, Monstruo.Elemento.AGUA, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/teostra.png")));
        Monstruo velkhana = new DragonAnciano("Velkhana", "Velkhana es el soberano del hielo, un dragón anciano que transforma el campo de batalla en un reino gélido. Con su aliento congelante y capacidad para invocar tormentas de nieve, cada enfrentamiento se convierte en una lucha contra el frío absoluto.", Monstruo.Elemento.HIELO, Monstruo.Elemento.FUEGO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/velkhana.png")));
        Monstruo nergigante = new DragonAnciano("Nergigante", "Nergigante es la encarnación de la furia primigenia, un dragón anciano que se regenera rápidamente y lanza ataques devastadores. Su piel impenetrable y fuerza brutal desafían las leyes de la naturaleza, representando el caos en su forma más pura.", Monstruo.Elemento.NINGUNO, Monstruo.Elemento.RAYO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/nergigante.png")));
        Monstruo fatalis = new DragonAnciano("Fatalis", "Fatalis es una leyenda viviente, el dragón ancestral más temido cuya fuerza descomunal y ataques infernales han dejado una marca imborrable en la historia. Su poder destructivo supremo ha arrasado civilizaciones, convirtiéndolo en un mito inigualable.", Monstruo.Elemento.DRACO, Monstruo.Elemento.DRACO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/fatalis.png")));
        Monstruo jhenMohran = new DragonAnciano("Jhen Mohran", "Jhen Mohran es un gigantesco wyvern marino con una armadura natural casi impenetrable. Su imponente figura y fuerza descomunal lo hacen uno de los desafíos más formidables en el océano.", Monstruo.Elemento.NINGUNO, Monstruo.Elemento.DRACO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/jhenMohran.png")));
        Monstruo alatreon = new DragonAnciano("Alatreon", "Alatreon es un dragón camaleónico que domina múltiples elementos, alternando entre fuego, hielo y rayo con una rapidez sorprendente. Su impredecibilidad y arsenal elemental lo hacen uno de los desafíos más intrigantes y peligrosos para los cazadores.", Monstruo.Elemento.DRACO, Monstruo.Elemento.DRACO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/alatreon.png")));
        Monstruo shagaruMagala = new DragonAnciano("Shagaru Magala", "Shagaru Magala, la evolución aterradora de Gore Magala, irradia una energía caótica que transforma todo a su paso. Su presencia en combate es una experiencia surrealista donde el caos y la destrucción se funden en una danza macabra.", Monstruo.Elemento.NINGUNO, Monstruo.Elemento.DRACO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/shagaruMagala.png")));
        Monstruo dalamadur = new DragonAnciano("Dalamadur", "Dalamadur es una serpiente dragón colosal, capaz de camuflarse entre las montañas y desatar ataques devastadores con una precisión letal. Su tamaño imponente y fuerza primigenia lo convierten en un símbolo del poder indomable de la tierra.", Monstruo.Elemento.NINGUNO, Monstruo.Elemento.DRACO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/dalamadur.png")));
        Monstruo chameleos = new DragonAnciano("Chameleos", "Chameleos es el maestro del engaño en el mundo de los dragones ancianos, famoso por su habilidad para volverse invisible y robar ítems. Su naturaleza camaleónica y astucia lo hacen un enemigo escurridizo y mortal, casi fantasmal en combate.", Monstruo.Elemento.NINGUNO, Monstruo.Elemento.DRACO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/chameleos.png")));
        Monstruo xenojiiva = new DragonAnciano("Xeno'jiiva", "Xenojiiva es un ser ancestral colosal cuya energía destructiva desafía toda lógica. Con un aura mística y presencia imponente, es considerado el epítome del poder primigenio, capaz de manipular fuerzas desconocidas para aniquilar a sus enemigos.", Monstruo.Elemento.DRACO, Monstruo.Elemento.FUEGO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/xenojiiva.png")));
        Monstruo kirin = new DragonAnciano("Kirin", "Kirin es un unicornio legendario, dotado de un cuerno resplandeciente y la capacidad de invocar rayos. Su elegancia etérea y ataques precisos lo convierten en un símbolo de pureza y poder elemental en el universo de Monster Hunter.", Monstruo.Elemento.RAYO, Monstruo.Elemento.FUEGO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/kirin.png")));
        Monstruo ceadeus = new DragonAnciano("Ceadeus", "Ceadeus es un colosal dragón marino venerado como una deidad. Su imponente figura y ataques precisos, que combinan la fuerza de las corrientes y la precisión depredadora, lo han convertido en un símbolo del poder ancestral del océano.", Monstruo.Elemento.AGUA, Monstruo.Elemento.DRACO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/ceadeus.png")));
        Monstruo amatsu = new DragonAnciano("Amatsu", "Amatsu es un dragón anciano que controla violentas tormentas en las profundidades. Su presencia altera el equilibrio del ecosistema marino, y sus ataques impredecibles y devastadores lo convierten en un adversario temible.", Monstruo.Elemento.AGUA, Monstruo.Elemento.DRACO, new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/monstruos/amatsu.png")));

        listaMonstruos.add(rathian);
        listaMonstruos.add(barroth);
        listaMonstruos.add(anjanath);
        listaMonstruos.add(diablos);
        listaMonstruos.add(rathalos);
        listaMonstruos.add(legiana);
        listaMonstruos.add(bazelgeuse);
        listaMonstruos.add(mizutsune);
        listaMonstruos.add(lagiacrus);
        listaMonstruos.add(jyuratodus);
        listaMonstruos.add(kushalaDaora);
        listaMonstruos.add(teostra);
        listaMonstruos.add(velkhana);
        listaMonstruos.add(nergigante);
        listaMonstruos.add(uragaan);
        listaMonstruos.add(tigrex);
        listaMonstruos.add(brachydios);
        listaMonstruos.add(radobaan);
        listaMonstruos.add(nargacuga);
        listaMonstruos.add(seregios);
        listaMonstruos.add(astalos);
        listaMonstruos.add(valstrax);
        listaMonstruos.add(zamtrios);
        listaMonstruos.add(gobul);
        listaMonstruos.add(ceadeus);
        listaMonstruos.add(plesioth);
        listaMonstruos.add(amatsu);
        listaMonstruos.add(fatalis);
        listaMonstruos.add(alatreon);
        listaMonstruos.add(shagaruMagala);
        listaMonstruos.add(dalamadur);
        listaMonstruos.add(chameleos);
        listaMonstruos.add(lagombi);
        listaMonstruos.add(jhenMohran);
        listaMonstruos.add(anjanath);
        listaMonstruos.add(khezu);
        listaMonstruos.add(kirin);
        listaMonstruos.add(basarios);
        listaMonstruos.add(xenojiiva);
    }

}
