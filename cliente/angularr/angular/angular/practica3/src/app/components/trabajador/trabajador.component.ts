import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Trabajador } from '../../models/trabajador';

@Component({
  selector: 'app-trabajador',
  imports: [],
  templateUrl: './trabajador.component.html',
  styleUrl: './trabajador.component.css'
})
export class TrabajadorComponent {
  @Input() trabajador!: Trabajador;

  @Output() likeTrabajador = new EventEmitter<number>();
  sumaVoto(id: number) {
    this.likeTrabajador.emit(id);
  }

  @Output() unlikeTrabajador = new EventEmitter<number>();
  restaVoto(id: number) {
    this.unlikeTrabajador.emit(id);
  }

  @Output() borrarTrabajador = new EventEmitter<number>();
  borrar(id: number) {
    this.borrarTrabajador.emit(id);
  }
}