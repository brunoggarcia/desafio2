package com.example.viagens.service;

import com.example.viagens.model.Destino;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DestinoService {

    private List<Destino> destinos = new ArrayList<>();
    private long idAtual = 1;

    public Destino criar(Destino destino) {
        destino.setId(idAtual++);
        destinos.add(destino);
        return destino;
    }

    public List<Destino> listarTodos() {
        return destinos;
    }

    public Destino buscarPorId(long id) {
        return destinos.stream()
                .filter(d -> d.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Destino> pesquisarPorNomeOuLocalizacao(String termo) {
        String t = termo.toLowerCase();
        List<Destino> resultado = new ArrayList<>();

        for (Destino d : destinos) {
            if (d.getNome().toLowerCase().contains(t) ||
                    d.getLocalizacao().toLowerCase().contains(t)) {
                resultado.add(d);
            }
        }
        return resultado;
    }

    public boolean excluir(long id) {
        return destinos.removeIf(d -> d.getId() == id);
    }

    // >>> NOVO MÉTODO DE AVALIAÇÃO <<
    public Destino avaliar(long id, int nota) {
        Destino destino = buscarPorId(id);
        if (destino != null) {
            destino.adicionarAvaliacao(nota);
        }
        return destino;
    }
}
