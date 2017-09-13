/*
Copyright (c) 2017 Red Hat, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package types;

import org.ovirt.api.metamodel.annotations.Link;
import org.ovirt.api.metamodel.annotations.Type;

/**
 * Describes how an external network provider is provisioned on a host.
 *
 * @author Dominik Holler <dholler@redhat.com>
 * @author Byron Gravenorst <bgraveno@redhat.com>
 * @date 09 Oct 2017
 * @status updated_by_docs
 * @since 4.2
 */
@Type
public interface ExternalNetworkProviderConfiguration extends Identified {

    /**
     * Link to the external network provider.
     *
     * @author Dominik Holler <dholler@redhat.com>
     * @author Byron Gravenorst <bgraveno@redhat.com>
     * @date 09 Oct 2017
     * @status updated_by_docs
     * @since 4.2
     */
    @Link ExternalProvider externalNetworkProvider();

    /**
     * Link to the host.
     *
     * @author Dominik Holler <dholler@redhat.com>
     * @author Byron Gravenorst <bgraveno@redhat.com>
     * @date 09 Oct 2017
     * @status updated_by_docs
     * @since 4.2
     */
    @Link Host host();
}
