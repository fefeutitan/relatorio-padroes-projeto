package service;

public class GeneroStrategyFactory {

    public static GeneroStrategy getStrategy(String genero) {
        if ("M".equalsIgnoreCase(genero)) {
            return new GeneroMasculino();
        } else {
            return new GeneroFeminino();
        }
    }
}

