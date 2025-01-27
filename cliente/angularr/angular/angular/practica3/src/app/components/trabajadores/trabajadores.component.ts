import { Component } from '@angular/core';
import { TrabajadorComponent } from "../trabajador/trabajador.component";
import { Trabajador } from '../../models/trabajador';
import { TRABAJADORES } from '../../../../public/data/data';

@Component({
  selector: 'app-trabajadores',
  imports: [TrabajadorComponent],
  templateUrl: './trabajadores.component.html',
  styleUrl: './trabajadores.component.css'
})
export class TrabajadoresComponent {
  title: string = 'Listado de trabajadores';
  trabajadores: Array<Trabajador> = TRABAJADORES;

  sumaVoto(id: number) {
    const trabajador = this.trabajadores.find(t => t.id === id);
    if (trabajador) trabajador.votos++;
  }

  restaVoto(id: number) {
    const trabajador = this.trabajadores.find(t => t.id === id);
    if (trabajador) {
      trabajador.votos--;
      if (trabajador.votos < 0) trabajador.votos = 0;
    }
  }

  borrar(id: number) {
    this.trabajadores = this.trabajadores.filter(t => t.id !== id);
  }
}