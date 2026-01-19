import { Component, Renderer2 } from '@angular/core';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent {
  constructor(private renderer: Renderer2) {}
  isSidebarCollapsed = false;

  toggleSidebar() {
    this.isSidebarCollapsed = !this.isSidebarCollapsed;
   /* if(this.isSidebarCollapsed){
    document.getElementById("mainContent")!.style.marginLeft = "260px";
    }else{
      document.getElementById("mainContent")!.style.marginLeft = "0px";
    }*/
  }


}
