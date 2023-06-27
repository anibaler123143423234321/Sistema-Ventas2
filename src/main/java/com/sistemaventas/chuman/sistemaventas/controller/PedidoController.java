package com.sistemaventas.chuman.sistemaventas.controller;

import com.sistemaventas.chuman.sistemaventas.entity.dto.GenerarPedidoDTO;
import com.sistemaventas.chuman.sistemaventas.entity.dto.PedidoConDetallesDTO;
import com.sistemaventas.chuman.sistemaventas.service.PedidoService;
import com.sistemaventas.chuman.sistemaventas.utils.GenericResponse;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/pedido")
public class PedidoController {
    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }
    //LISTAR PEDIDOS CON DETALLES
    @RequestMapping(value = "/misPedidos/{idCli}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericResponse<List<PedidoConDetallesDTO>> devolverMisComprasConDetalle(@PathVariable int idCli){
        return this.service.devolverMisCompras(idCli);
    }
    //GUARDAR PEDIDO
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericResponse guardarPedido(@RequestBody GenerarPedidoDTO dto){
        return this.service.guardarPedido(dto);
    }
    //ANULAR PEDIDO
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericResponse anularPedido(@PathVariable int id){
        return this.service.anularPedido(id);
    }
    //EXPORTAR PDF DE ORDEN

    @GetMapping(value = "exportInvoice", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Resource> exportInvoice(@RequestParam int idCli, @RequestParam int idOrden){
        return this.service.exportInvoice(idCli, idOrden);
    }
}
