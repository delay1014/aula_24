// Pokemon.java
public class Pokemon implements PokemonInterface {
    private String nome;
    private String tipo;
    private int saude;

    public Pokemon(String nome, String tipo, int saude) {
        this.nome = nome;
        this.tipo = tipo;
        this.saude = saude;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int getSaude() {
        return saude;
    }

    @Override
    public void setSaude(int saude) {
        this.saude = saude;
    }

    @Override
    public void atacaPokemon(Pokemon pokemon) {
        // Implemente a lógica para atacar outro Pokémon aqui
    }

    @Override
    public void pokemonInfo(Pokemon pokemon) {
        // Implemente a lógica para exibir informações do Pokémon aqui
    }
}
